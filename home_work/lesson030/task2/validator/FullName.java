package home_work.lesson030.task2.validator;

import home_work.lesson030.task2.exception.invalidNameException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FullName {
    String surname;
    String name;
    String patronymic;

    FullName(String fullName) {
        String[] parts = fullName.split(" ");
        this.surname = parts[0];
        this.name = parts[1];
        this.patronymic = parts[2];
    }

    public static FullName validate(String fullName) {


//
        Pattern p = Pattern.compile("([А-Я][а-я]+)(|-([А-Я][а-я]+))(\\s([А-Я][а-я]+)){2}");
        Matcher m = p.matcher(fullName);
        if (!m.find()) {
            throw new invalidNameException();
        }
        return new FullName(fullName);
    }

    @Override
    public String toString() {
        return "Фамилия: " + this.surname + "\nИмя: " + this.name + "\nОтчество: " + this.patronymic + "\n";
    }
}

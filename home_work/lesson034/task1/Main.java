package home_work.lesson034.task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = stingToDate("20.12.2022 20:16:03");
        System.out.println(time);
    }


    //  20.12.2022 20:16:00.
    private static LocalDateTime stingToDate(String dateText) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        ;
        LocalDateTime parsedDate = LocalDateTime.parse(dateText, formatter);
        return parsedDate;
    }

}

package home_work.lesson030.task1;

import home_work.lesson030.task1.validator.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        String number1 = "+7 (956) 464-43-13";
        String number2 = "+7 9564644313";
        System.out.println(PhoneNumber.validate(number1));
        System.out.println(PhoneNumber.validate(number2));
    }
}

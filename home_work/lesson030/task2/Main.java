package home_work.lesson030.task2;

import home_work.lesson030.task2.validator.FullName;

public class Main {
    public static void main(String[] args) {
        String name1 = "Гребнев Борис Станиславович";
        //String name2 = "+7 9564644313";
        String name3 = "Гребнев-Панин Борис Станиславович";
        System.out.println(FullName.validate(name1));
        //System.out.println(FullName.validate(name2));
        System.out.println(FullName.validate(name3));
    }
}

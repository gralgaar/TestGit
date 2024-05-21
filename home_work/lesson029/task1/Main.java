package home_work.lesson029.task1;

import home_work.lesson029.task1.model.Generic;

/**
 * Реализуйте обобщенный тип, хранящий параметризованное поле.
 * Также в классе Main реализуйте параметризованый метод,
 * принимает первым параметром объект вашего дженерика,
 * вторым — объект типа, которым параметризован объект первого параметра.
 * Метод должен возвращать значение поля дженерика, если оно != null,
 * в противном случае — возвращать второй параметр.
 */

public class Main {
    public static void main(String[] args) {


        Generic<String> stringGeneric = new Generic<>("bla bla bla");
        System.out.println(doSmth(stringGeneric, "tur tur"));

        Generic<Integer> intGeneric = new Generic<>();

        System.out.println(doSmth(intGeneric, 7));

    }

    private static <T> T doSmth(Generic<T> generic, T object) {
        return generic.getObject() == null ? object : generic.getObject();
    }
}

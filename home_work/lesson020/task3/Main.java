package home_work.lesson020.task3;

import home_work.lesson020.task3.exception.UnknownAnimalException;
import home_work.lesson020.task3.model.Animal;
import home_work.lesson020.task3.model.Cat;
import home_work.lesson020.task3.model.Cow;
import home_work.lesson020.task3.model.Dog;

public class Main {

    /**
     * Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow.
     * Каждый из наследников должен содержать свой метод: woof(), meow() и moo() соответственно.
     * Остальные поля и методы суперкласса и наследников реализовать по своему усмотрению,
     * если они необходимы.
     * <p>
     * Каждый из методов должен выводить в консоль соответствующую ему строку:
     * "woof ", "meow " или "moo".
     * <p>
     * В main() создать и наполнить в произвольном порядке
     * объектами разных классов-наследников массив типа Animal.
     * Реализовать метод, принимающий массив Animal и вызывающий метод,
     * характерный для конкретного животного.
     * <p>
     * Использовать при решении instanceof, getClass() или другие неизвестные нам механики – недопустимо.
     * <p>
     * Дополнительное условие (необязательно): решить задачу, при условии,
     * что woof(), meow() и moo() внутри себя выполняют только вызов protected-метода sound(),
     * который определен в Animal.
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Animal(), new Cow(), new Cow(), new Cow(), new Animal()};
        try {
            soundAll(animals);
        } catch (UnknownAnimalException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void soundAll(Animal[] animals) throws UnknownAnimalException {
        for (Animal animal : animals) {
            if (animal.getClass().equals(Dog.class)) {
                System.out.println("Собака");
            }
            if (animal.getClass().equals(Cow.class)) {
                System.out.println("Корова");
            }
            if (animal.getClass().equals(Cat.class)) {
                System.out.println("Кошка");
            }


            if (!(animal.getClass().equals(Cow.class)) && !(animal.getClass().equals(Dog.class)) && !(animal.getClass().equals(Cat.class))) {
                throw new UnknownAnimalException("Ошибка!!!  Неизвестное животное");
            }


            animal.sound();
        }
    }


}



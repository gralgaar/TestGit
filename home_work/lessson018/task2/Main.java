package home_work.lessson018.task2;

import home_work.lessson018.task2.model.Animal;
import home_work.lessson018.task2.model.Cat;
import home_work.lessson018.task2.model.Cow;
import home_work.lessson018.task2.model.Dog;

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
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    //    Используя поле класса Animal, определяем, какой настоящий класс обрабатываемого объекта
    private static void sound(Animal animal) {

        if (animal.getClass().equals(Cat.class)) ((Cat) animal).meow();
        else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).moo();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).woof();
        } else {
            //На случай, если был создан объект Animal, а не наследника.
            // Или если наследник неизвестен
            System.out.println("Unknown animal!");
        }
    }
}


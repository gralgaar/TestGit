package home_work.lesson020.task3.model;

public class Animal {

    public static final String ANIMAL_CLASS_NAME = "Animal";

    //    Поле, которое будет хранить имя класса, чтобы идентифицировать наследника
    private final String className;
    //    Выполнение доп. условия. Если методы наследников лишь обращаются к sound() -
//    нам необходимо делать вывод звука животного в этом классе. Значит, звук животного
//    нужно куда-то записать
    private final String sound;

    protected Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    public Animal() {
        this(ANIMAL_CLASS_NAME, "undefined");
    }

    public void sound() {
        System.out.println(sound);
    }

    public String getClassName() {
        return className;
    }
}

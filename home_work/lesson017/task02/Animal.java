package home_work.lesson017.task02;

public enum Animal {
    CAT("meow"),
    COW("MUUUUUUUUU"),
    DOG("BARK!!!");

    String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public String sound() {
        return this.sound;
    }
}

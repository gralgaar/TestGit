package home_work.lesson017.task02;


public class Main {
    public static void main(String[] args) {

        soundAll();
    }

    private static void soundAll() {
        Animal[] animals = Animal.values();
        for (Animal animal : animals) {
            System.out.println(animal.sound());
        }
    }
}

package home_work.lesson016.task02;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через switch-case
 */
public class Main {
    public static void main(String[] args) {
//        Создаем сканер для чтения с клавиатуры
        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();
        Responsive response = switch (s) {
            case "Hi" ->  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                    new Hello();
            //System.out.println("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
            case "Bye" -> new Bye();
            //System.out.println("Good bye");
            case "How are you" -> new How();
            //System.out.println("How are your doing");
            default ->  // Если значение s не совпадает ни с одним кейсом
                    new Unkonwn();
            //System.out.println("Unknown message");
        };
//        Используем конструкцию switch-case для переменной s
        System.out.println(response.response());

    }
}
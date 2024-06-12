package home_work.lesson034.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 20.12.2022 20:16:03
        sc.close();

        LocalDateTime time = stingToDate(str);

        if (isFuture(time)) {
            System.out.println("Эта дата находится в будущем");
        } else {
            System.out.println("Эта дата находится в прошлом");
        }


    }


    //  20.12.2022 20:16:00.
    private static LocalDateTime stingToDate(String dateText) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime parsedDate = LocalDateTime.parse(dateText, formatter);
        return parsedDate;
    }

    private static boolean isFuture(LocalDateTime time) {
        LocalDateTime now = LocalDateTime.now();
        return now.isBefore(time);
    }
}

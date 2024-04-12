package home_work.lesson026.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");

        String line = sc.nextLine();
        line = line.strip();
        String[] split = line.split(" ");

        int uniqueWords = 0;

        for (int i = 0; i < split.length; i++) {
            Boolean isUniq = true;
            for (int j = 0; j < split.length; j++) {
                if ((i != j) && (split[i].equals(split[j]))) {
                    isUniq = false;
                    break;
                }

            }
            if (isUniq) uniqueWords++;
        }

        System.out.println(uniqueWords);
    }
}

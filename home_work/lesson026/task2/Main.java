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
            boolean isUniq = true;
            int j = 0;
            while (j < i) {
                if (split[i].equals(split[j])) {
                    isUniq = false;
                    break;
                }
                j++;
            }
            if (isUniq) uniqueWords++;


        }

        System.out.println(uniqueWords);
    }
}

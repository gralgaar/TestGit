package home_work.lesson007;

import java.util.Arrays;

public class Task05 {
    public static void main(String args[]) {
        int n = 1;
        for (int i = 0; i < 10; i++) {
            n++;
            while (!(isPrime(n))) {
                n++;
            }

            System.out.println(n);
        }


    }

    static boolean isPrime(int n) {
        if (n < 1) return false;

        if (n == 1 | n == 0) return true;

        return div(n, n - 1);
    }

    static boolean div(int n, int check) {
        if (check == 1) return true;
        if ((n % check) == 0) return false;
        else return div(n, check - 1);
    }
}

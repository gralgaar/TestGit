package home_work.lesson010.task03;

import java.util.Arrays;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */
public class Main {
    public static void main(String[] args) {

        SimpleFinder simple = new SimpleFinder();

        //выводим сумму массива
        System.out.println(sum(simple.primeNumbers));

        //выводим первые 5 элементов массива
        System.out.println(Arrays.toString(simple.getFirstSimple(6)));
    }


    //    Логика реализации удобного метода-обертки, по аналогии с предыдущей задачей
    static int sum(int[] numbers) {
        return sum(numbers, 0);
    }

    static int sum(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return numbers[i];
        }

        return numbers[i] + sum(numbers, i + 1);
    }
}



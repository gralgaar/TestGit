package home_work.lesson010.task03;

public class SimpleFinder {
    static int[] primeNumbers = new int[10];


    SimpleFinder() {
        this.primeNumbers = primeNumbers;
        for (int i = 0; i < this.primeNumbers.length; i++) {
            if (i == 0) {
                this.primeNumbers[i] = 2;
            } else {
                int addingValue = i == 1 ? 1 : 2;
                int number = this.primeNumbers[i - 1] + addingValue;
                this.primeNumbers[i] = findNextPrimeNumber(number, this.primeNumbers, i);
            }
        }
    }

    static int[] getFirstSimple(int n) {
        int[] firstSimple = new int[n];
        for (int i = 0; i < n; i++) {
            firstSimple[i] = SimpleFinder.primeNumbers[i];
        }
        return firstSimple;
    }


    //    В данном случае, рекурсивно реализован вызов проверки для нового числа в рамках
    //    заполнения одного элемента массива
    static int findNextPrimeNumber(int number, int[] primeNumbers, int currentIndex) {
        boolean isPrime = isPrime(number, primeNumbers, currentIndex);

        if (isPrime) {
            return number;
        }

        number += 2;

        return findNextPrimeNumber(number, primeNumbers, currentIndex);
    }

    //    Метод проверки конкретного числа на то, является ли оно простым
    static boolean isPrime(int number, int[] primeNumbers, int currentIndex) {
        int j = 0;
        boolean isPrime = true;

        while (isPrime && j < currentIndex && number / primeNumbers[j] > 1) {
            if (number % primeNumbers[j] == 0) {
                isPrime = false;
            } else {
                j++;
            }
        }
        return isPrime;
    }
}

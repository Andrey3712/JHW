// Задача 2: Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        System.out.println("Введите конечное число интервала: "); // по условиям N = 1000
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;

            for (int i = 1; i < n; i++) {
                if (isPrime(i)) {
                    System.out.print(i + "\t");
                    count++;
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
            }
            System.out.println("\n" + "Количество простых чисел в интервале от 1 до " + n + " равно " + count);
        }
    }

    public static boolean isPrime(int i) {

        boolean temp = false;

        if (i == 2) {
            temp = true;
        }

        for (int j = 2; j < i; j++) {
            if (j == (i - 1)) {
                temp = true;
            }
            if ((i % j) == 0) {
                break;
            }
        }
        return temp;
    }
}

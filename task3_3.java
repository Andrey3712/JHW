// Задача 3: Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class task3_3 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            arr.add(x);
        }

        int n = arr.size();
        int i;

        System.out.println("Начальный массив: ");

        int sum = 0;

        for (i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        Collections.sort(arr);

        System.out.println("Сортированный массив: ");

        for (i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
            sum += arr.get(i);

        }

        System.out.println();

        int min = arr.get(0);
        int max = arr.get(n - 1);

        double avg = (double) sum / arr.size();

        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        System.out.println("Среднее арифметическое: " + avg);

    }
}

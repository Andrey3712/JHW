// Задача 2: Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class task3_2 {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int x = ran.nextInt(10);
            arr.add(x);
        }
        System.out.println("Начальный массив: " + arr.toString());

        int i = 0;

        while (i < arr.size()) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Массив без четных чисел: " + arr.toString());

    }
}

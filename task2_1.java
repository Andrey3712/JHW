//Задача 1: Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_1 {
    private static final Logger LOGGER = Logger.getLogger(task2_1.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        
        FileHandler fileTxt = new FileHandler("bubblesort.txt");
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        LOGGER.addHandler(fileTxt);
        // logger

        int[] arr = { -3, 21, 34, 5, 78, -23, 7, 3, -61, 15, 56 };
        LOGGER.info("Начальный массив: " + Arrays.toString(arr));
        List<Integer> sortedList = sort(arr);
        LOGGER.info("Сортированный массив: " + sortedList);
    }

    public static List<Integer> sort(int[] arr) {
        boolean swapped;
        int temp;
        List<Integer> sortedList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    LOGGER.info("Меняем местами: " + arr[j] + " и " + arr[j + 1]);
                }
            }
            if (!swapped)
                break;
        }
        for (int j : arr) {
            sortedList.add(j);
        }
        return sortedList;
    }
}
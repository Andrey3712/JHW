// Задача 3*: Логгирование операций с простейшем калькулятором

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_3 {
    static Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger(task2_3.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileTxt = new FileHandler("Calc.txt");
        SimpleFormatter formatterTxt = new SimpleFormatter();
        fileTxt.setFormatter(formatterTxt);
        LOGGER.addHandler(fileTxt);

        int operand1 = nextInt();
        int operand2 = nextInt();
        char operation = getOperation();
        int result = calc(operand1, operand2, operation);
        System.out.println("Результат операции: \n" + result);
        System.out.println();
        LOGGER.info("Введите число: " + operand1);
        LOGGER.info("Введите число: " + operand2);
        LOGGER.info("Введите операцию: " + operation);
        LOGGER.info("Результат операции: " + result);
    }

    public static int nextInt() {

        System.out.println("Введите число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Допушена ошибка при вводе числа! Повторите ввод числа!");
            scanner.next();
            operand = nextInt();
        }
        return operand;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допушена ошибка при вводе операции! Повторите ввод операции!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int operand1, int operand2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Операция не распознана! Повторите ввод!");
                result = calc(operand1, operand2, getOperation());

        }
        return result;
    }
}

import java.util.*;

public class Notebook {

    String name;
    double diagonal;
    int maxRAM;
    int maxHDD;
    String opSystem;
    String color;
    int price;

    public Notebook(String name, double diagonal, int maxRAM, int maxHDD, String opSystem, String color, int price) {
        this.name = name;
        this.diagonal = diagonal;
        this.maxRAM = maxRAM;
        this.maxHDD = maxHDD;
        this.opSystem = opSystem;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nНоутбук:              " + name +
                "\nДиаганаль, дюймы:    " + diagonal +
                "\nОбъем RAM, ГБ: " + maxRAM +
                "\nОбъем жесткий диск, ГБ:     " + maxHDD +
                "\nТип ОС:              " + opSystem +
                "\nЦвет:                " + color +
                "\nЦена:                " + price;
    }

    public static void menu() {
        System.out.print("""
                Поиск ноутбука по параметрам:
                1 - диаганаль экрана
                2 - объем оперативной памяти RAM
                3 - объем жесткого диска
                4 - тип операционной системы
                5 - цвет корпуса
                6 - использовать все пареметры для выбора
                Введите значение: \s""");
    }

    public static Set<Object> normDemands(Set<Notebook> mySet) {
        Scanner aScanner = new Scanner(System.in);
        int decisionNumber = aScanner.nextInt();
        String text1 = """
                Доступны ноутбуки с диагональю экрана:
                - 14.5 дюйма;
                - 15.6 дюйма;
                - 17.3 дюйма.
                Введите значение: \s""";

        String text2 = """
                Доступны ноутбуки с обьемом памяти RAM:
                - 4  ГБ;
                - 8  ГБ;
                - 16 ГБ.
                Введите значение: \s""";

        String text3 = """
                Доступны ноутбуки с объемом жесткого диска:
                - 1000 ГБ;
                - 512  ГБ;
                - 500  ГБ;
                - 256  ГБ.
                Введите значение: \s""";

        String text4 = """
                Доступны ноутбуки с операционной системой:
                - Windows10;
                - Windows11;
                - MacOS.
                Введите ОС: \s""";

        String text5 = """
                Доступны ноутбуки с цветом корпуса:
                - silver;
                - gray;
                - black.
                Введите цвет корпуса: \s""";

        double diagonal;
        int maxRAM;
        int maxHDD;
        String opSystem;
        String color;

        Set<Object> request = new HashSet<>();
        if (decisionNumber == 1) {
            System.out.printf("\n%s", text1);
            Scanner bScanner = new Scanner(System.in);
            diagonal = Double.parseDouble(bScanner.next());
            request.add(diagonal);
            result(mySet, request);
            return request;

        }
        if (decisionNumber == 2) {
            System.out.printf("\n%s", text2);
            Scanner cScanner = new Scanner(System.in);
            maxRAM = cScanner.nextInt();
            request.add(maxRAM);
            result(mySet, request);
            return request;

        }
        if (decisionNumber == 3) {
            System.out.printf("\n%s", text3);
            Scanner dScanner = new Scanner(System.in);
            maxHDD = dScanner.nextInt();
            request.add(maxHDD);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 4) {
            System.out.printf("\n%s", text4);
            Scanner eScanner = new Scanner(System.in);
            opSystem = eScanner.next();
            request.add(opSystem);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 5) {
            System.out.printf("\n%s", text5);
            Scanner fScanner = new Scanner(System.in);
            color = fScanner.next();
            request.add(color);
            result(mySet, request);
            return request;
        }
        if (decisionNumber == 6) {
            System.out.printf("\n%s", text1);
            Scanner bScanner = new Scanner(System.in);
            diagonal = Double.parseDouble(bScanner.next());
            request.add(diagonal);

            System.out.printf("\n%s", text2);
            Scanner cScanner = new Scanner(System.in);
            maxRAM = cScanner.nextInt();
            request.add(maxRAM);

            System.out.printf("\n%s", text3);
            Scanner dScanner = new Scanner(System.in);
            maxHDD = dScanner.nextInt();
            request.add(maxHDD);

            System.out.printf("\n%s", text4);
            Scanner eScanner = new Scanner(System.in);
            opSystem = eScanner.next();
            request.add(opSystem);

            System.out.printf("\n%s", text5);
            Scanner fScanner = new Scanner(System.in);
            color = fScanner.next();
            request.add(color);
            equals(mySet, request);
            return request;

        }
        return request;
    }

    public static void result(Set<Notebook> mySet, Set<Object> request) {
        boolean flag = false;
        System.out.println("\nПо запросу найдены ноутбуки: \n");
        for (Notebook notebook : mySet) {
            for (Object elem : request) {
                if (elem.equals(notebook.diagonal) || elem.equals(notebook.maxRAM) || elem.equals(notebook.maxHDD) ||
                        elem.equals(notebook.opSystem) || elem.equals(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                }
                if (elem.equals(notebook.diagonal) && elem.equals(notebook.maxRAM) && elem.equals(notebook.maxHDD) &&
                        elem.equals(notebook.opSystem) && elem.equals(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                }
            }
        }
        if (!flag) {
            System.out.println("\nНоутбуков с указанными параметрами в настоящее время нет");
        }
    }

    public static void equals(Set<Notebook> mySet, Set<Object> request) {
        boolean flag = false;
        for (Notebook notebook : mySet) {
            for (Object ignored : request) {
                if (request.contains(notebook.diagonal) && request.contains(notebook.maxRAM)
                        && request.contains(notebook.maxHDD) && request.contains(notebook.opSystem)
                        && request.contains(notebook.color)) {
                    flag = true;
                    System.out.println(notebook);
                    break;
                }
            }

        }
        if (!flag) {
            System.out.println("\nНоутбуков с указанными параметрами в настоящее время нет");
        }
    }
}

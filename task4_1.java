// Задача 1: Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет "перевернутый" список.
import java.util.*;

public class task4_1 {
    public static void main(String[] args) {
        // Declaring linkedlist without any initial size
        LinkedList<String> ll = new LinkedList<String>();
        // Appending elements at the end of the list
        ll.add("AAA");
        ll.add("BBB");
        ll.add("CCC");
        ll.add("DDD");
        ll.add("EEE");
        System.out.print("Исходный список: " + ll);
        ll = reverseLinkedList(ll);
        System.out.print("\nПеревернутый список: " + ll);
    }

    // Takes a linkedlist as a parameter and returns a reversed linkedlist
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
        LinkedList<String> revll = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revll.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revll;
    }
}

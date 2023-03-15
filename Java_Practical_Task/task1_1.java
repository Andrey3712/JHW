// Вычислить факториал n! чисел от 1 до n (произведение чисел от 1 до n)
// n = 5
// n! 1 * 2 * 3 * 4 * 5 = 120

package Java_Practical_Task;

public class task1_1 {
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }
}

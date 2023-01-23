import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int value = -1;

        for (;value != 0;) {
            value = new Scanner(System.in).nextInt();
            int factorial = 1;
            if (value != 0) {
                for (int i = value; i > 0; i = i - 1) {
                    factorial = factorial * i;
                }
                System.out.println("Факториал числа " + value + " = " + factorial);
                System.out.println("Для остановки программы введите 0, для продолжения - новое число:");
            }
            else {
                System.out.println("Программа остановлена. До свидания!");
                break;
            }
        }
    }
}

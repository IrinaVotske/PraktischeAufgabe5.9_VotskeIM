import java.util.Scanner;

public class Cycles_while {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Введите число для суммирования и нажмите Enter: ");

        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value != 0) {
                sum = sum + value;
                System.out.println("Сумма: " + sum);
                System.out.println("Введите ещё одно число или 0 для сброса суммы:");
            } else {
                sum = 0;
                System.out.println("Сумма сброшена. Введите новое число:");
            }
        }
    }
}

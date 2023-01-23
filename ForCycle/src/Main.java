import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
             for (int x = value; x > 0; x = x - 1) {
                if (i * x == value) {
                    String answer = i + " * " + x;
                    System.out.println(answer);
                }
//                else {
//                    break;
//                }
            }
        }
    }
}

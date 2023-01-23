import java.util.Scanner;

public class For_test {
//    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int value = -1; value != 0;) {
//            value = new Scanner(System.in).nextInt();
//            sum = sum + value;
//        }
//        System.out.println("Сумма введенных чисел равна "+ sum);
//    }

    public static void main(String[] args) {
//        int i = 0;
//
//        while (i < 20) {
//            if (i > 6 && i < 10) {
//                continue;
//            }
//            System.out.println(i + "Yes!");
//            i = i + 1;
//
//        }
//    }
//}
        for (int i = 0; i < 10; ) {
            if (i < 5) {
                i = i + 1;
//              System.out.println(i + " in");
            }
            i = i + 1;
            System.out.println(i + " out");
        }
    }
}

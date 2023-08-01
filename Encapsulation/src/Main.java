import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// Code for using my Elevator:
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }

   /*  ImmutableCargo boxOne = new ImmutableCargo(40,40,60,10,"Kobuleti, Georgia",true,"G123456", true);
    boxOne.getDimensions();
    boxOne.toString();*/
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/

        Dimensions dimensions = new Dimensions();
        CargosShipment cargosShipment = new CargosShipment(dimensions, 100, "Markova, Brusnichnaya, 1", true,"A123456",true);
        System.out.println(cargosShipment.toString());

        Dimensions dimensions1 = dimensions.setHeight(0.2);
        System.out.println(dimensions + ", cargo's volume: " + cargosShipment.dimensions.cargoVolume + " sq.m.");
        System.out.println(dimensions1);
        CargosShipment cargosShipment1 = cargosShipment.setDimensions(dimensions1);
        System.out.println(cargosShipment.toString());
        System.out.println(cargosShipment1.getDimensions().getHeight());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Система рассчета стоимости топлива");

        int fuelType = 95;
        int fuelAmount = 50;

        boolean hasDiscount = fuelAmount > 10;

        double fuel92prise = 67.2;
        double fuel95price = 68.33;

        double discount = 0.1;

        String wrongFuelTypeMessage = "Указан неверный тип топлива";

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92prise;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95price;
        }
        else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = fuelPrice*(1-discount);
        }

        if (fuelAmount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            fuelAmount = 0;
        }
        String fuelPriceMessage = "Цена выбраноого топлива: " + fuelPrice + " руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * fuelAmount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}

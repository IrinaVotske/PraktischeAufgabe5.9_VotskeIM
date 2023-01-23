public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeeRequired = 15;

        if (!isBlocked && milkAmount >= cappuchinoMilkRequired && coffeeAmount >= cappuchinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирована или ингридиентов недостаточно!");
        }
    }
}
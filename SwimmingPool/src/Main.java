public class Main {
    public static void main(String[] args) {
        int volume = 1200;

        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int filledVolume = 0; //Volume, filled already
        int minutesFilling = 0; //Minutes, needed for filling up the pool

        while (filledVolume < volume) {
            minutesFilling = minutesFilling + 1;
            filledVolume = (fillingSpeed - devastationSpeed) * minutesFilling;
        }
        System.out.println("Бассейн с текущими параметрами наполнится за " + minutesFilling + " минут(у).");
    }
}

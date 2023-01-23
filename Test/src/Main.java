public class Main {
    public static void main(String[] args) {
        for (int i = 15;i < 40;i = i + 1) {
            System.out.println(i);

            if (i == 16) {
                System.out.println("Вы можете начать обучаться вождению");
            }
            if (i == 18) {
                System.out.println("Вы можете получить права");
            }
            if (i == 35) {
                System.out.println("Вы можете баллотироваться на пост президента");
            }
        }
        //System.out.println("Цикл завершен. i = "+i);
    }
}
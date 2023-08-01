import static java.lang.Math.*;

public class Elevator {
    private int currentFloor = 1; // текущий этаж
    //минимальный и максимальный этажи:
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        System.out.println("Наш лифт идет от " + minFloor + " до " + maxFloor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        return currentFloor = currentFloor - 1;
    }

    public int moveUp() {
        return currentFloor = currentFloor + 1;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Вы указали недопустимый этаж. Введите значение от ");
        } else {
            int difFloor = floor - currentFloor;
            System.out.println("Мы на этаже: " + getCurrentFloor() + ". Нам нужно проехать " + difFloor + " этажа(ей).");
            if (difFloor == 0) {
                System.out.println("Мы уже на " + getCurrentFloor() + " этаже и никуда не едем.");
            } else {
                System.out.println("Поехали!");
                for (int i = 1; i <= abs(difFloor); i = i + 1) {
                    if (difFloor > 0) {
                        moveUp();
                    } else {
                        moveDown();
                    }
                    System.out.println(getCurrentFloor());
                    }
                }
            }

        }
    }

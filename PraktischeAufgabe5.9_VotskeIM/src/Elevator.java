public class Elevator {
    public int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveDown() {
        return currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public int moveUp() {
        return currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public int move(int floor) {
        if ((minFloor <= floor) && (floor <= maxFloor)) {
            if (floor > currentFloor) {
                while (floor > currentFloor) {
                    moveUp();
                    System.out.println(currentFloor);
                }
            } else if (floor < currentFloor) {
                while (floor < currentFloor) {
                        moveDown();
                        System.out.println(currentFloor);
                }
            } else if (floor == currentFloor) {
                System.out.println("We are already in place :)");
            }
        } else {
            System.out.println("The inserted value is wrong: you can choose the floor only between " + minFloor + " and " + maxFloor);
        }
        System.out.println("The Elevator is on the floor: " + currentFloor);
        return currentFloor;
    }
}

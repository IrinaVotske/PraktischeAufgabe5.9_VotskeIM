public class GearBox {
    /**
     * 0 - neutral
     * -1 - rear
     * 1-6
     */

    private int minGear = 1;
    private int maxGear = 6;

    private int gear = 0;

    public int shiftUp() {
        gear = gear < maxGear ? gear + 1 : gear;
    }

    public int shiftDown() {
        gear = gear > minGear ? gear - 1 : gear;
    }

    public int switchRear() {
        gear = gear > 1 ? gear : -1;
    }

    public int switchNeutral () {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }
}

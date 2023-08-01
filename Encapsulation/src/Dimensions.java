final class Dimensions {

    private final int widthCargo; //cm
    private final int heightCargo; //cm
    private final int lengthCargo; //cm
    private int volumeCargo; //cm3
    private String cargoDimensions;

    public Dimensions(int widthCargo, int heightCargo, int lengthCargo) {
        this.widthCargo = widthCargo;
        this.heightCargo = heightCargo;
        this.lengthCargo = lengthCargo;
        this.volumeCargo = calcVolumeCargo(widthCargo, heightCargo, lengthCargo);
    }

    public int calcVolumeCargo(int widthCargo, int heightCargo, int lengthCargo) {
        return volumeCargo = widthCargo * heightCargo * lengthCargo;
    }

    public Dimensions setWidthCargo(int widthCargo) {
        return new Dimensions(widthCargo, heightCargo, lengthCargo);
    }

    public Dimensions setHeightCargo(int heightCargo) {
        return new Dimensions(widthCargo, heightCargo, lengthCargo);
    }

    public Dimensions setLengthCargo(int lengthCargo) {
        return new Dimensions(widthCargo, heightCargo, lengthCargo);
    }
    public int getWidthCargo() {
        return widthCargo;
    }

    public int getHeightCargo() {
        return heightCargo;
    }

    public int getLengthCargo() {
        return lengthCargo;
    }

    public int getVolumeCargo() {
        return volumeCargo;
    }

    public String toString(int widthCargo, int heightCargo, int lengthCargo) {
        return cargoDimensions = " Д * Ш * В груза: " + getLengthCargo() + " * " + getWidthCargo() + " * " + getHeightCargo() + ". Объем груза: " + getVolumeCargo() + ".";
    };
}

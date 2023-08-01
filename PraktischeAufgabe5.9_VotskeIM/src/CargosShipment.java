public class CargosShipment {
//    Object Dimensions;
    public final Dimensions dimensions = new Dimensions();
    private final int weight; // gr
    private final String address;
    private final Boolean noTipping;
    private final String regNumber; // Can contain numbers & letters
    private final Boolean fragile;

    public CargosShipment(Dimensions dimensions, int weight, String address, Boolean noTipping, String regNumber, Boolean fragile) {
        this.weight = weight;
        this.address = address;
        this.noTipping = noTipping;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public CargosShipment setAddress(String address) {
        return new CargosShipment(dimensions, weight, address, noTipping, regNumber, fragile);
    }

    public CargosShipment setDimensions(Dimensions dimensions) {
        return new CargosShipment(dimensions, weight, address, noTipping, regNumber, fragile);
    }

    public CargosShipment setWeight(int weight) {
        return new CargosShipment(dimensions, weight, address, noTipping, regNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getNoTipping() {
        return noTipping;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Boolean getFragile() {
        return fragile;
    }

    @Override
    public String toString() {
        return "CargosShipment{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", noTipping=" + noTipping +
                ", regNumber='" + regNumber + '\'' +
                ", fragile=" + fragile +
                '}';
    }
}

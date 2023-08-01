public class Dimensions {
    private final double width; // m
    private final double height; // m
    private final double length; // m
    public double cargoVolume; // sq.m.

    public Dimensions() {
        width = 0.1;
        height = 0.1;
        length = 0.1;
    }
    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double calcCargoVolume(double width, double height, double length) {
        return cargoVolume = width * height * length;
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(width, height, length);
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(width, height, length);
    }

    public Dimensions setLength(double length) {
        return new Dimensions(width, height, length);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "width = " + width + " m," +
                ", height = " + height + " m," +
                ", length = " + length + " m," +
                '}';
    }
}

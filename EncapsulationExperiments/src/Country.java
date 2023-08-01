public class Country {
    private String name;
    private int numberPeople;
    private int squareKilometers;
    private String nameCapitalCity;
    private boolean accessToSea = false;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public int getSquareKilometers() {
        return squareKilometers;
    }

    public String getNameCapitalCity() {
        return nameCapitalCity;
    }

    public boolean isAccessToSea() {
        return accessToSea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public void setSquareKilometers(int squareKilometers) {
        this.squareKilometers = squareKilometers;
    }

    public void setNameCapitalCity(String nameCapitalCity) {
        this.nameCapitalCity = nameCapitalCity;
    }

    public void setAccessToSea(boolean accessToSea) {
        this.accessToSea = accessToSea;
    }
}

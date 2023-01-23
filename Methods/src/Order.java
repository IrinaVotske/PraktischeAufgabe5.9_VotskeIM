public class Order {
    private int count = 0;
    private  int cost = 0;
    private int totalCost = 0;
    private int productsCount = 0;

    public void addProducts(int productsCount, int totalCost) {
        count = count + productsCount;
        cost = cost + totalCost;
    }

    public int getTotalCost() {
        return cost;
    }

    public int getProductsCount() {
        return count;
    }
}

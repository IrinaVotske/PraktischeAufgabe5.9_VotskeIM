public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket(){
        items = "Список товаров: ";
        this.limit = 1000000;
    }
    public Basket(int totalPriceLimit){
        this();
        this.limit = totalPriceLimit;
    }

    public void add(String name, int price) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price > limit){
            System.out.println("Превышение лимита, не облагаемого налогом. Лимит равен: "+ limit);
            return;
        }
        items = items + "\n" + name +  " - " + price;
        totalPrice = totalPrice + price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }
    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}

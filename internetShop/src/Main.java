public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100);
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб",49);

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата",280);
        petyaBasket.add("Бочка", 2900);

        vasyaBasket.print("Корзина Васи:");
        System.out.println("");
        petyaBasket.print("Корзина Пети:");
    }
//    add("Колбаса", 76);
//    add("Молоко", 55);
//    add("Масло", 76);
//    print("Содержимое корзины:");
//        System.out.println("Стоимость товаров: " + getTotalPrice());
//        System.out.println();
//    clear();
//    print("Содержимое корзины:");
//        System.out.println(getTotalPrice());
}

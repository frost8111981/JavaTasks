package ObjectsAndMethods.Basket;

public class Basket {
    private double totalWeight = 0;
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private static int allPrice = 0;
    private static double allWeight = 0;

    public Basket() {
        increaseCount(1);
        allPrice(totalPrice);                               //
        allWeight(totalWeight);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }



    public static void allPrice(int totalPrice) {            //
        Basket.allPrice = Basket.allPrice + totalPrice;
    }

    public static void allWeight(double totalWeight) {            //
        Basket.allWeight = Basket.allWeight + totalWeight;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }


        increaseCount(count);
        items = items + "\n" + name + " - " + count + " шт. - " + price + " руб. ";
        totalPrice = totalPrice + count * price;
        int i = price * count;
        allPrice(i);
        System.out.println("Общая стоимость - " + Basket.allPrice);
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        totalWeight = totalWeight + weight;
        double i = weight * count;
        allWeight(i);
        System.out.println("Общий вес - " + totalWeight + " кг.");
        System.out.println("Общий вес 2 - " + Basket.allWeight + " кг.");

    }








    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public static int getCount() {
        return count;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "totalWeight=" + totalWeight +
                ", items='" + items + '\'' +
                ", totalPrice=" + totalPrice +
                ", limit=" + limit +
                '}';
    }
}

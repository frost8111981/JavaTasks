package ObjectsAndMethods.Basket;

public class Basket {
    private double totalWeight = 0;
    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
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

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }



    public void add(String name, int price) {                               // 2
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {                    // 1
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

        items = items + "\n" + name + " - " + count + " шт. - " + price + " руб. " ;
        totalPrice = totalPrice + count * price;
    }



    public void add(String name, int price, int count, double weight){      // 3
        add(name,price,count);
        totalWeight = totalWeight + weight;
        System.out.println("Общий вес - " + totalWeight + " кг.");

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

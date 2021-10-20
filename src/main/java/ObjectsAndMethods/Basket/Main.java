package ObjectsAndMethods.Basket;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Bread", 50);
        basket.print("Bread");

        System.out.println();

        basket.add("Meet",60,1,3);
        basket.print("Meet");
        basket.add("Solt",50,1,0.5);
        basket.print("Solt");



    }
}

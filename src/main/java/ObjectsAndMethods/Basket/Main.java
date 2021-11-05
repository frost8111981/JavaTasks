package ObjectsAndMethods.Basket;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Bread", 50);
        basket.print("Bread");

        System.out.println();

        basket.add("Meet",60,1,3);
        basket.print("Meet");

        System.out.println();
        basket.add("Solt",50,1,0.5);
        basket.print("Solt");





    }
}

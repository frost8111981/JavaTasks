package ObjectsAndMethods.Elevator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Раскомментировать после "заполнения" класса Elevator
         */

        Elevator elevator = new Elevator(1, 10);

        while(true) {
            System.out.print("Введите номер этажа: ");
            System.out.println("Текущий этаж: " + elevator.getCurrentFloor());
            int pushFloor = new Scanner(System.in).nextInt();
            elevator.move(pushFloor);
        }
    }
}

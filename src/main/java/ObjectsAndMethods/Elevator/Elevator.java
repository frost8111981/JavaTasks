package ObjectsAndMethods.Elevator;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown() {
        System.out.println(currentFloor = currentFloor - 1);
    }

    public void moveUp() {
        System.out.println(currentFloor = currentFloor + 1);
    }

    public void move(int pushFloor) {
        int tempFloor = 0;
        if (pushFloor > currentFloor & pushFloor < maxFloor) {
            tempFloor = pushFloor - currentFloor;
            for (int i = 0; i < tempFloor; i++) {
                moveUp();
            }
        } else if (pushFloor < currentFloor & pushFloor >= minFloor) {
            tempFloor = currentFloor - pushFloor;
            for (int i = 0; i < tempFloor; i++) {
                moveDown();
            }
        } else {
            System.out.println("Не верно введен этаж ");
        }

    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}


//    public void move(int pushFloor) {
//        if (pushFloor <= maxFloor & pushFloor >= minFloor) {
//            int tempFloor = 0;
//            if (currentFloor < pushFloor) {
//                for (int i = 0; i < pushFloor - currentFloor; i ++) {
//                    moveUp();
//                    System.out.println(currentFloor);
//                }
//            } else {
//                tempFloor = currentFloor - pushFloor;
//                for (int i = 0; i < tempFloor; i++) {
//                    moveDown();
//                    System.out.println(currentFloor);
//                }
//            }
//        } else {
//            System.out.println("error");
//        }
//    }

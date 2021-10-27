package ObjectsAndMethods.Elevator;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

public Elevator(int minFloor, int maxFloor){
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
}

    public int getCurrentFloor(){
        return currentFloor;
    }

    public void moveDown(){
    currentFloor = currentFloor -  1;
    }

    public void moveUp(){
        currentFloor = currentFloor + 1;
    }
    public void move(int floor){
    if(floor <= maxFloor & floor >= minFloor){
        int tempFloor = 0;
        if(currentFloor < floor){
            tempFloor = floor - currentFloor;
            for(int i = 0; i < tempFloor; i ++){
                moveUp();
                System.out.println(currentFloor);
            }
        }else{
            tempFloor = currentFloor - floor;
            for(int i = 0; i < tempFloor; i ++){
                moveDown();
                System.out.println(currentFloor);
            }
        }
    }else{
        System.out.println("error");
    }
    }
}

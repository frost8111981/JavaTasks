package ObjectsAndMethods.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator(3,5,Operation.ADD);
        Calculator cal2 = new Calculator(5,3,Operation.SUBTRACT);
        Calculator cal3 = new Calculator(2,2, Operation.MULTIPLY);

        cal.calculate(Operation.ADD);
        cal.calculate(Operation.SUBTRACT);
        cal3.calculate(Operation.MULTIPLY);
    }
}

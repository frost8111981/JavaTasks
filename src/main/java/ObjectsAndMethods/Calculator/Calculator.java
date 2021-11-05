package ObjectsAndMethods.Calculator;

public class Calculator {
    private int a;
    private int b;
    Operation operation;

    public Calculator(int a, int b, Operation operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public void calculate(Operation operation){
        if(operation == Operation.ADD){
           int c =  a + b;
           System.out.println("Сумма чисел равна  " + c);
        }else
        if(operation == Operation.SUBTRACT){
            int c =  a - b;
            System.out.println("Разность чисел равна  " + c);
        }else
        if(operation == Operation.MULTIPLY){
            int c =  a * b;
            System.out.println("Произведение чисел равно  " + c);
        }

    }
}

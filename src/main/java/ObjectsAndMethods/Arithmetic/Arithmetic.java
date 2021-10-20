package ObjectsAndMethods.Arithmetic;

public class Arithmetic {
   private int a;
   private int b;

   public Arithmetic(int a, int b){
       this.a = a;
       this.b = b;
   }

   public void summ(){
       int c = a + b;
       System.out.println("Сумма = " + c);
   }

   public int raznost(){
       int c = a * b;
       System.out.println("Разность = " + c);
       return c;
   }

   public void max(){
       int max;
       if(a < b){
           max = b;
       } else{
           max = a;
       }
       System.out.println("Максимальное = " + max);
   }

   public static void min(int a, int b){
       int min;
       if(a > b){
           min = b;
       } else{
           min = a;
       }
       System.out.println("Минимальное = " + min);
   }

}

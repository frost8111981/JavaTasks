package ObjectsAndMethods.Printer;

public class Main {
    public static void main(String[] args) {


        Printer pr = new Printer();
        pr.append("Договор", "Доп соглашение", 5);
        pr.print();
        System.out.println();
       // pr.clear();
        pr.append("Инструкция", " Настройка проектора", 30);
        pr.append("Техника Безопасности", "Действия при пожаре", 1);
        pr.print();
        System.out.println(pr.getPendingPagesCount());
        System.out.println(pr.getAllTimePages());
    }
}

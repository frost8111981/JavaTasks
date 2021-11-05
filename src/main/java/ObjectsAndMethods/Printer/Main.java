package ObjectsAndMethods.Printer;

public class Main {
    public static void main(String[] args) {

        Printer pr = new Printer();

        pr.append("Техника Безопасности - ", "Действия при пожаре: ", 3);
        pr.print();

        pr.append("Инструкция ");
        pr.print();








        //        pr.append("ТЕСТ", "noname", 1);
//        pr.print();
//        pr.append("Договор - ", "Доп соглашение: ", 5);
//        pr.print();
//
//        pr.append("Инструкция - ", "Настройка проектора: ", 30);
//
//        pr.append("Техника Безопасности - ", "Действия при пожаре: ", 1);
//        pr.print();
//        System.out.println();
//
//        System.out.println("Общее количество страниц - " + pr.getPendingPagesCount());
//
//        pr.clear();
//        pr.print();
    }
}

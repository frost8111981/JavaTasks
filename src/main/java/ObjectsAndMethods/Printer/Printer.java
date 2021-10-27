package ObjectsAndMethods.Printer;

import java.util.ArrayList;
import java.util.List;

public class Printer {
    private String name;
    private String text;
    private int pages;
    private String queue;
    private  int pageCount;
    private int allTimePages;

    public Printer() {
        increaseCount(1);
        queue = "Очередь документов";
    }

    private void increaseCount(int i) {
    }

    public void append(String name, String text, int pages) {           // 3
        append(name, text);

        this.pageCount = this.pageCount + pages;
        this.allTimePages = this.allTimePages + pages;
        queue = queue + "\n" + pages + " стр " ;
    }

    public void append(String name, String text) {              // 2
        append(text);
        queue = queue + "\n" + name;

    }

    public void append(String text) {                    // 1
        queue = queue + text;
    }

    private boolean contains(String name) {
        return queue.contains(name);
    }

    public void print(){
        System.out.println(queue);
    }

    public void clear(){
        this.pageCount = 0;
        this.queue = "Очередь печати";
    }
    public int getPendingPagesCount(){
        return this.pageCount;
    }

    public int getAllTimePages(){
        return this.allTimePages;
    }


}

package ObjectsAndMethods.Computer;


import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Китай",2, 2,0.2);
        RAM ram = new RAM("внешняя ", 4, 0.1);
        ROM rom = new ROM("SSD", 500, 0.8);
        Screen screen = new Screen("IPS", 17, 5.0);
        Keyboard keyboard = new Keyboard("проводная","светодиодная", 1);

        System.out.println(processor);
        processor.setManufacturer("США");

        System.out.println();
        System.out.println();

        Computer computer = new Computer("DELL","США", processor, ram, rom, screen, keyboard);
        System.out.println(computer);

    }
}

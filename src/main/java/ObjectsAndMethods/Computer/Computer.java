package ObjectsAndMethods.Computer;

public final class Computer {
    private final Processor processor;
    private final RAM ram;
    private final ROM rom;
    private final Screen screen;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;

    private double totalWeight;

    public Computer(String name, String vendor, Processor processor, RAM ram, ROM rom, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.ram = ram;
        this.vendor = vendor;
        this.name = name;
        this.rom = rom;
        this.screen = screen;
        this.keyboard = keyboard;

    }

    public double totalWeight(double totalWeight){
      totalWeight = processor.getWeight() + ram.getWeight() + rom.getWeight() + screen.getWeight() + keyboard.getWeight();
      return totalWeight;
    }



    @Override
    public String toString() {
        return "Характеристики компьютера: " + "Компания - " + name + ", Производитель - " + vendor + " \n " +
                "Процессор: " + processor + " \n " +
                "Оперативная память: " + ram + " \n " +
                "Физическая память: " + rom + " \n " +
                "Монитор: " + screen + " \n " +
                "Клавиатура: " + keyboard + " \n " +
                "Общий вес комплектующих - " + totalWeight(totalWeight);

    }

//  public void print(){
//    System.out.println("Процессор - " + processor + "\n" + " Оперативка - " + ram);
//  }

}

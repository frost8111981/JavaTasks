package ObjectsAndMethods.Computer;

public final class ROM {
    private String type;
    private int memory;
    private double weight;

    public ROM(String type, int memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "тип памяти - " + type + "; " +
                "объем - " + memory + "; " +
                "масса - " + weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

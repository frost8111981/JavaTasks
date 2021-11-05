package ObjectsAndMethods.Computer;

public final class Processor {
    private double frequency;
    private int cores;
    private String manufacturer;
    private double weight;

    public Processor(String manufacturer, double frequency, int cores, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "частота - " + frequency + "; " +
                "количество ядер - " + cores + "; " +
                "производитель - " + manufacturer + "; " +
                "масса - " + weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

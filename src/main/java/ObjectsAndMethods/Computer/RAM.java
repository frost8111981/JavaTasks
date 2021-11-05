package ObjectsAndMethods.Computer;

public final class RAM {
private String type;
private int volume;
private double weight;

    public RAM(String type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "тип памяти - " + type + "; " +
                "объем - " + volume + "; " +
                "масса - " + weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

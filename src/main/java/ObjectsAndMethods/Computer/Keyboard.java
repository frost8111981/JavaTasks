package ObjectsAndMethods.Computer;

public final class Keyboard {
    private String type;
    private String backlight;
    private double weight;

    public Keyboard(String type, String backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "тип - " + type + "; " +
                "подсветка - " + backlight + "; " +
                "масса - " + weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

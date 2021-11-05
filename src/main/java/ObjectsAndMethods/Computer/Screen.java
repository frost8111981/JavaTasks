package ObjectsAndMethods.Computer;

public final class Screen {
    private int diagonal;
    private String type;
    private double weight;

    public Screen(String type, int diagonal, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "диагональ - " + diagonal + "; " +
                "тип - " + type + "; " +
                "масса - " + weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

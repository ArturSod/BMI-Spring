package desafio.model;

public enum BMIDesc {
    UNDERWEIGHT(0, 18.4),
    NORMAL_WEIGHT(18.5, 24.9),
    OVERWEIGHT(25.0, 29.9),
    OBESITY_I(30.0, 34.9),
    OBESITY_II(35.0, 39.9),
    OBESITY_III(40.0, 1000000.0);
    private double min;
    private double max;
    BMIDesc(double min, double max) {
        this.max = max;
        this.min = min;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
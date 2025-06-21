public class Forecast {
    private double currentValue;
    private double growthRate;
    private int futureYears;

    public Forecast(double currentValue, double growthRate, int futureYears) {
        this.currentValue = currentValue;
        this.growthRate = growthRate;
        this.futureYears = futureYears;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getFutureYears() {
        return futureYears;
    }

    public void setFutureYears(int futureYears) {
        this.futureYears = futureYears;
    }
}

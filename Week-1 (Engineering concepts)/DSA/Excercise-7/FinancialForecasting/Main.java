public class Main {

    public static double predictFutureValue(Forecast obj) {
        if (obj.getFutureYears() == 0) {
            return obj.getCurrentValue();
        }
        obj.setCurrentValue(obj.getCurrentValue() * (1.0 + obj.getGrowthRate()));
        obj.setFutureYears(obj.getFutureYears() - 1);
        return predictFutureValue(obj);
    }

    public static void main(String[] args) {
        Forecast obj = new Forecast(1234, 0.05, 5);
        double currentValue = predictFutureValue(obj);
        System.out.println("Predicted Future Value: " + currentValue);
    }
}

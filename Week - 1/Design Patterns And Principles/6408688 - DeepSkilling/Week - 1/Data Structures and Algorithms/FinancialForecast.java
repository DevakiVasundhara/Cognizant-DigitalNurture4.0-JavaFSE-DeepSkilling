public class FinancialForecast {

        public static double futureValueRecursive(double initialValue, double growthRate, int years) {
                if (years == 0) {
            return initialValue;
        }

                return futureValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initial = 10000.0;             double rate = 0.10;                   int years = 5;                
        double future = futureValueRecursive(initial, rate, years);
        System.out.printf("Forecasted value after %d years: ₹%.2f%n", years, future);
    }
}

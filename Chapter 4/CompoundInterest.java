public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0;

        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("Interest Rate: %d%%%n", rate);
            for (int year = 1; year <= 10; year++) {
                double amount = principal * Math.pow(1.0 + rate / 100.0, year);
                System.out.printf("Year %2d: %.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}
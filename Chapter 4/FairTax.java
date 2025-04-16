import java.util.Scanner;
public class FairTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] categories = {"Housing", "Food", "Clothing", "Transportation", "Education", "Health care", "Vacations"};
        double totalSpending = 0.0;

        for (String category : categories) {
            System.out.print("Enter spending on " + category + ": ");
            totalSpending += input.nextDouble();
        }

        double fairTax = totalSpending * 0.23;
        System.out.printf("Estimated FairTax: $%.2f%n", fairTax);
    }
}
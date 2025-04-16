//Exercise 3.19
// 3.19 Sales Commission Calculator
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sales, earnings;
        
        System.out.print("Enter total sales: ");
        sales = input.nextDouble();
        earnings = 200 + (0.09 * sales);
        System.out.printf("Total earnings: $%.2f\n", earnings);
        input.close();
    }
}


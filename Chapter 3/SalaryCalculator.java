// 3.20 Salary Calculator
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter hours worked for employee " + i + ": ");
            int hours = input.nextInt();
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();
            double salary = (hours <= 40) ? hours * rate : (40 * rate + (hours - 40) * 1.5 * rate);
            System.out.printf("Gross pay for employee %d: $%.2f\n", i, salary);
        }
        input.close();
    }
}

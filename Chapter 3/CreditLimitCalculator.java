// 3.18 Credit Limit Calculator
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter balance at the beginning of the month: ");
        int balance = input.nextInt();

        System.out.print("Enter total charges: ");
        int charges = input.nextInt();

        System.out.print("Enter total credits: ");
        int credits = input.nextInt();

        System.out.print("Enter credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = balance + charges - credits;

        System.out.println("New balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

        input.close();
    }
}
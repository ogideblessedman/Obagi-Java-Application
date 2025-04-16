import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer (1-99999): ");
        int number = input.nextInt();
        
        displayDigits(number);
    }
    
    // Part a: Integer quotient
    public static int quotient(int a, int b) {
        return a / b;
    }
    
    // Part b: Integer remainder
    public static int remainder(int a, int b) {
        return a % b;
    }
    
    // Part c: Display digits separated by spaces
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999");
            return;
        }
        
        // Determine divisor based on number length
        int divisor = 1;
        int temp = number;
        while (temp >= 10) {
            temp /= 10;
            divisor *= 10;
        }
        
        // Extract and print each digit
        while (divisor > 0) {
            int digit = quotient(number, divisor);
            System.out.print(digit + "  ");
            number = remainder(number, divisor);
            divisor = quotient(divisor, 10);
        }
        System.out.println();
    }
}
import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();
        
        System.out.printf("The smallest number is: %.2f%n", minimum3(num1, num2, num3));
    }
    
    public static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
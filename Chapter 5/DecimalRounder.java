import java.util.Scanner;

public class DecimalRounder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numbers to round (enter -1 to quit):");
        
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            if (number == -1) {
                break;
            }
            
            System.out.printf("Original number: %f%n", number);
            System.out.printf("Rounded to integer: %d%n", roundToInteger(number));
            System.out.printf("Rounded to tenths: %.1f%n", roundToTenths(number));
            System.out.printf("Rounded to hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("Rounded to thousandths: %.3f%n%n", roundToThousandths(number));
        }
    }
    
    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
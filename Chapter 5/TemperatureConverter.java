import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Temperature Conversion");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double fahrenheit = input.nextDouble();
            System.out.printf("Celsius equivalent: %.1f°C%n", celsius(fahrenheit));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double celsius = input.nextDouble();
            System.out.printf("Fahrenheit equivalent: %.1f°F%n", fahrenheit(celsius));
        } else {
            System.out.println("Invalid choice");
        }
    }
    
    // Part a: Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    
    // Part b: Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter numbers to round (enter -1 to quit):");
        
        while (true) {
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            if (number == -1) {
                break;
            }
            
            double rounded = Math.floor(number + 0.5);
            
            System.out.printf("Original: %.2f, Rounded: %.0f%n%n", number, rounded);
        }
    }
}
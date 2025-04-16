import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length of side 1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter length of side 2: ");
        double side2 = input.nextDouble();
        
        System.out.printf("Hypotenuse: %.2f%n", hypotenuse(side1, side2));
        
        // Calculate for triangles in Fig. 5.14
        System.out.println("\nTriangle 1 (3.0, 4.0): " + hypotenuse(3.0, 4.0));
        System.out.println("Triangle 2 (5.0, 12.0): " + hypotenuse(5.0, 12.0));
        System.out.println("Triangle 3 (4.0, 16.0): " + hypotenuse(4.0, 16.0));
    }
    
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        // Alternatively: return Math.hypot(side1, side2);
    }
}
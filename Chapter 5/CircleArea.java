import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        System.out.printf("Area of the circle: %.2f%n", circleArea(radius));
    }
    
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
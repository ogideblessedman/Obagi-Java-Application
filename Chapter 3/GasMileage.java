// Exercise 3.17 
//(Gas Mileage) Develop a program that calculates miles per gallon:
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles, gallons;
        double mpg;
        
        while (true) {
            System.out.print("Enter miles (-1 to stop): ");
            miles = input.nextInt();
            if (miles == -1) break;
            System.out.print("Enter gallons: ");
            gallons = input.nextInt();
            mpg = (double) miles / gallons;
            System.out.println("Miles per gallon: " + mpg);
        }
    }
}

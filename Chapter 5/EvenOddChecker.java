import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter integers to check (enter 0 to quit):");
        
        while (true) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationTutor {
    private static final SecureRandom random = new SecureRandom();
    private static int num1, num2;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        generateQuestion();
        
        while (true) {
            System.out.printf("How much is %d times %d? (or 0 to quit) ", num1, num2);
            int answer = input.nextInt();
            
            if (answer == 0) {
                System.out.println("Goodbye!");
                break;
            }
            
            if (answer == num1 * num2) {
                System.out.println("Very good!");
                generateQuestion();
            } else {
                System.out.println("No. Please try again.");
            }
        }
    }
    
    public static void generateQuestion() {
        num1 = 1 + random.nextInt(9);
        num2 = 1 + random.nextInt(9);
    }
}
import java.security.SecureRandom;
import java.util.Scanner;

public class ArithmeticTutor {
    private static final SecureRandom random = new SecureRandom();
    private static int num1, num2;
    private static int operation; // 1=add, 2=subtract, 3=multiply, 4=divide, 5=mixed
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Arithmetic Tutor!");
        System.out.println("Choose problem type:");
        System.out.println("1. Addition only");
        System.out.println("2. Subtraction only");
        System.out.println("3. Multiplication only");
        System.out.println("4. Division only");
        System.out.println("5. Random mixture");
        System.out.print("Enter your choice (1-5): ");
        
        operation = input.nextInt();
        if (operation < 1 || operation > 5) {
            System.out.println("Invalid choice. Using mixed mode.");
            operation = 5;
        }
        
        generateQuestion();
        
        while (true) {
            String question = getQuestionText();
            System.out.printf("%s (or 0 to quit) ", question);
            double answer = input.nextDouble();
            
            if (answer == 0) {
                System.out.println("Goodbye!");
                break;
            }
            
            if (isCorrect(answer)) {
                System.out.println(getPositiveFeedback());
                generateQuestion();
            } else {
                System.out.println(getNegativeFeedback());
            }
        }
    }
    
    public static void generateQuestion() {
        num1 = 1 + random.nextInt(9);
        num2 = 1 + random.nextInt(9);
        
        if (operation == 5) {
            // For mixed mode, select random operation
            operation = 1 + random.nextInt(4);
        }
        
        // For division, ensure whole number result
        if (operation == 4) {
            num1 = num1 * num2; // Make dividend a multiple of divisor
        }
    }
    
    public static String getQuestionText() {
        switch (operation) {
            case 1: return String.format("How much is %d plus %d?", num1, num2);
            case 2: return String.format("How much is %d minus %d?", num1, num2);
            case 3: return String.format("How much is %d times %d?", num1, num2);
            case 4: return String.format("How much is %d divided by %d?", num1, num2);
            default: return "";
        }
    }
    
    public static boolean isCorrect(double answer) {
        switch (operation) {
            case 1: return answer == num1 + num2;
            case 2: return answer == num1 - num2;
            case 3: return answer == num1 * num2;
            case 4: return Math.abs(answer - ((double)num1 / num2)) < 0.0001;
            default: return false;
        }
    }
    
    public static String getPositiveFeedback() {
        String[] compliments = {
            "Excellent!", "Very good!", "Nice work!", "Keep up the good work!"
        };
        return compliments[random.nextInt(compliments.length)];
    }
    
    public static String getNegativeFeedback() {
        String[] encouragements = {
            "No. Please try again.", "Wrong. Try once more.", 
            "Don't give up!", "No. Keep trying."
        };
        return encouragements[random.nextInt(encouragements.length)];
    }
}
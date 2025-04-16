import java.util.Scanner;

public class MultiplesChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter two integers (or 0 0 to quit): ");
            int first = input.nextInt();
            int second = input.nextInt();
            
            if (first == 0 && second == 0) {
                break;
            }
            
            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is NOT a multiple of " + first);
            }
        }
    }
    
    public static boolean isMultiple(int first, int second) {
        return first != 0 && second % first == 0;
    }
}
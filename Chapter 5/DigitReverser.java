import java.util.Scanner;

public class DigitReverser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();
        
        System.out.println("Reversed number: " + reverseDigits(number));
    }
    
    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}
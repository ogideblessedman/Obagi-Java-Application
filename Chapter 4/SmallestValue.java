import java.util.Scanner;
public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int count = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int value = scanner.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("Smallest value is: " + smallest);
    }
}
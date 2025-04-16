// 3.23 Find Two Largest Numbers

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, number;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number: ");
            number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.printf("Largest: %d, Second Largest: %d\n", largest, secondLargest);
        input.close();
    }
}


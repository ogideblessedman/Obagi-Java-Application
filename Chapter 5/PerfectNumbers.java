public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        
        for (int number = 2; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " is perfect. Factors: ");
                printFactors(number);
                System.out.println();
            }
        }
        
        // Challenge: Testing larger numbers
        System.out.println("\nTesting larger numbers (up to 10000):");
        for (int number = 1001; number <= 10000; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " is perfect. Factors: ");
                printFactors(number);
                System.out.println();
            }
        }
    }
    
    public static boolean isPerfect(int number) {
        int sum = 1; // 1 is a factor for all numbers
        
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
    
    public static void printFactors(int number) {
        System.out.print("1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
            }
        }
    }
}
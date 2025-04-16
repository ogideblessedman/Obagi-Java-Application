public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10000:");
        int count = 0;
        
        for (int number = 2; number < 10000; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        
        System.out.printf("\nTotal primes found: %d%n", count);
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        
        // Check divisors up to number/2
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
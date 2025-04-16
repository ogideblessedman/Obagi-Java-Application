public class OptimizedPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10000 (optimized):");
        int count = 0;
        
        for (int number = 2; number < 10000; number++) {
            if (isPrimeOptimized(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        
        System.out.printf("\nTotal primes found: %d%n", count);
    }
    
    public static boolean isPrimeOptimized(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        
        // Check divisors up to sqrt(number)
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random random = new Random();
        
        // a) 1 ≤ n ≤ 2
        int n = random.nextInt(2) + 1;
        
        // b) 1 ≤ n ≤ 100
        n = random.nextInt(100) + 1;
        
        // c) 0 ≤ n ≤ 9
        n = random.nextInt(10);
        
        // d) 1000 ≤ n ≤ 1112
        n = random.nextInt(113) + 1000; // 1112-1000+1 = 113
        
        // e) -1 ≤ n ≤ 1
        n = random.nextInt(3) - 1; // (1 - (-1) + 1) = 3
        
        // f) -3 ≤ n ≤ 11
        n = random.nextInt(15) - 3; // (11 - (-3) + 1) = 15
    }
}
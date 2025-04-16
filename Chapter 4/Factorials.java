public class Factorials {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.printf("%2d! = %d%n", i, fact);
        }
    }
}

import java.util.Random;

public class RandomSetNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        
        // a) 2, 4, 6, 8, 10
        int[] setA = {2, 4, 6, 8, 10};
        System.out.println("Random from set A: " + setA[random.nextInt(setA.length)]);
        
        // b) 3, 5, 7, 9, 11
        int[] setB = {3, 5, 7, 9, 11};
        System.out.println("Random from set B: " + setB[random.nextInt(setB.length)]);
        
        // c) 6, 10, 14, 18, 22
        int[] setC = {6, 10, 14, 18, 22};
        System.out.println("Random from set C: " + setC[random.nextInt(setC.length)]);
    }
}
// 3.39 Decrypting Encrypted Numbers

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit encrypted number: ");
        int num = input.nextInt();
        int d1 = (num / 1000 + 3) % 10;
        int d2 = (num / 100 % 10 + 3) % 10;
        int d3 = (num / 10 % 10 + 3) % 10;
        int d4 = (num % 10 + 3) % 10;
        System.out.printf("Decrypted: %d%d%d%d\n", d3, d4, d1, d2);
        input.close();
    }
}

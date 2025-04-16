// 3.38 Enforcing Privacy with Cryptography

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = input.nextInt();
        int d1 = (num / 1000 + 7) % 10;
        int d2 = (num / 100 % 10 + 7) % 10;
        int d3 = (num / 10 % 10 + 7) % 10;
        int d4 = (num % 10 + 7) % 10;
        System.out.printf("Encrypted: %d%d%d%d\n", d3, d4, d1, d2);
        input.close();
    }
}

// 3.25 Checkerboard Pattern

import java.util.Scanner;

public class Checkerboard {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print((i % 2 == j % 2) ? "* " : "  ");
            }
            System.out.println();
        }
    }
}

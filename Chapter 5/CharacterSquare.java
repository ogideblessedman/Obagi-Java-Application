import java.util.Scanner;

public class CharacterSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();
        
        System.out.print("Enter the fill character: ");
        char fill = input.next().charAt(0);
        
        squareOfAnyCharacter(side, fill);
    }
    
    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int row = 0; row < side; row++) {
            for (int col = 0; col < side; col++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
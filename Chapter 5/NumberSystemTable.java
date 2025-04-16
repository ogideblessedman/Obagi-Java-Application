public class NumberSystemTable {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\t\tOctal\tHexadecimal");
        System.out.println("-----------------------------------------------");
        
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%d\t%s\t%s\t%s%n",
                i,
                toBinary(i),
                toOctal(i),
                toHex(i));
        }
    }
    
    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
    
    public static String toOctal(int number) {
        return Integer.toOctalString(number);
    }
    
    public static String toHex(int number) {
        return Integer.toHexString(number).toUpperCase();
    }
}
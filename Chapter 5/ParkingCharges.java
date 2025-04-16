import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        
        System.out.println("Enter hours parked for each customer (enter -1 to quit):");
        
        while (true) {
            System.out.print("Enter hours parked: ");
            double hours = input.nextDouble();
            
            if (hours == -1) {
                break;
            }
            
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Current customer charge: $%.2f%n", charge);
            System.out.printf("Running total receipts: $%.2f%n%n", totalReceipts);
        }
        
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
    }
    
    public static double calculateCharges(double hours) {
        double minimumFee = 2.00;
        double maximumFee = 10.00;
        double additionalRate = 0.50;
        int baseHours = 3;
        
        if (hours <= baseHours) {
            return minimumFee;
        }
        
        double additionalHours = Math.ceil(hours - baseHours);
        double charge = minimumFee + (additionalHours * additionalRate);
        
        return Math.min(charge, maximumFee);
    }
}
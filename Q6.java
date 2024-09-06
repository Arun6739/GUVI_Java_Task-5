package task5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = num.nextInt();
        
        
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12."); 
            return;
        }
        
        System.out.print("Enter the room rent per day: ");
        double roomRent = num.nextDouble();
        
        System.out.print("Enter the number of days stayed: ");
        int daysStayed = num.nextInt();
        double totalTariff;
        
        switch (month) {
            case 4:  
            case 5:  
            case 6:  
            case 11: 
            case 12: 
                totalTariff = roomRent * 1.20 * daysStayed;
                break;
            default:
                totalTariff = roomRent * daysStayed;
        }
        System.out.printf("Total tariff: %.2f\n", totalTariff);
    }
}

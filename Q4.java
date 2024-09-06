package task5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
         System.out.print("Enter the number of rows (odd number): ");
        int n = num.nextInt();
        
        if(n%2==0) {
        	System.out.println("Enter Odd numbers only");
        }
        
        else {
        for (int i = 1; i <= n / 2 + 1; i++) {     
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }
            if (i != n / 2 + 1) {
                System.out.println("*");
            } else {
                System.out.println();
            }
        }

        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            System.out.print("*");
            for (int j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    }
}

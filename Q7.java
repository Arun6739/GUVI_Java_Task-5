package task5;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner num = new Scanner(System.in);

        // Input: Three numbers
        System.out.print("Enter the first number: ");
        int num1 = num.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = num.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = num.nextInt();

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Output the largest number
        System.out.println("The largest number is: " + largest);
        num.close();
    }
}

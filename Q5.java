package task5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = num.nextInt();
                if (marks > 100) {
            System.out.println("Invalid Input");
        } else if (marks == 100) {
            System.out.println("Grade: S");
        } else if (marks >= 90 && marks <= 99) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: D");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        num.close();
    }
}

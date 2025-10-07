package myown;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking first number as input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Taking second number as input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculating sum
        int sum = num1 + num2;

        // Printing result
        System.out.println("The sum of the two numbers is: " + sum);

        // Closing the scanner
        sc.close();
    }
}


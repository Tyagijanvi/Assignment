package javaprogram;

import java.util.Scanner;


public class EvenOrOddChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Close the scanner
        scanner.close();

	}

}

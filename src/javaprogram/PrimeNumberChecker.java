package javaprogram;

import java.util.Scanner;


public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        // Input number from user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        // Check if the number is prime
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        
	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;


	}

}

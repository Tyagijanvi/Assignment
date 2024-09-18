package javaprogram;

class BankAccount {
	    // Attributes of the BankAccount class
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    // Constructor to initialize the account details
	    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount);
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }

	    // Method to display account details
	    public void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	        System.out.println();; // Blank line for readability
	

}
 }

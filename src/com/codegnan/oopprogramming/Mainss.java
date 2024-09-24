
package com.codegnan.oopprogramming;

public class Mainss {
    int accountNumber;
    String accountHolder;
    int accountbalance;

    // Constructor with parameters
    public Mainss(int accountNumber, String accountHolder, int accountbalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountbalance = accountbalance;
    }

    // Default constructor
    public Mainss() {
        // No-argument constructor
    }

    // Method to deposit money
    public void deposit(int depositAmount) {
        if (depositAmount > 0) { // Ensure the deposit amount is positive
            accountbalance += depositAmount;
            System.out.println("Deposited: $" + depositAmount);
            displayBalance(); // Display the updated balance
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= accountbalance) {
            accountbalance -= withdrawalAmount;
            System.out.println("Withdrew: $" + withdrawalAmount);
            displayBalance(); // Display the updated balance
        } else if (withdrawalAmount > accountbalance) {
            System.out.println("Error: Insufficient funds. Cannot withdraw more than the current balance.");
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Account Balance: $" + accountbalance);
    }

    // Main method for testing the BankAccount class
    public static void main(String[] args) {
        // Create two BankAccount objects with initial balances
        Mainss account1 = new Mainss(123456, "John Doe", 50);
        Mainss account2 = new Mainss(789012, "Jane Smith", 1000);

        // Display the initial balances
        account1.displayBalance(); // Display balance of account1
        account2.displayBalance(); // Display balance of account2

        // Perform transactions on account1
        account1.deposit(20);   // Deposit $20 into account1
        account1.withdraw(30);  // Withdraw $30 from account1
        account1.withdraw(50);  // Attempt to withdraw $50 from account1 (should give an error)

        // Perform transactions on account2
        account2.deposit(500);  // Deposit $500 into account2
        account2.withdraw(200); // Withdraw $200 from account2
        account2.withdraw(1500); // Attempt to withdraw $1500 from account2 (should give an error)

        // Display the final balances
        account1.displayBalance(); // Final balance of account1
        account2.displayBalance(); // Final balance of account2
    }
}

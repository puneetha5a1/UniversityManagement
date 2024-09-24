package com.codegnan.oopprogramming;

public class BankAccount {
	int amount;
	int accountNumber;
	String accountHolder;
	int accountbalance;
	//constructor
	public BankAccount( int accountNumber,String accountHolder,int accountbalance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.accountbalance=accountbalance;
	}
	
		public BankAccount() {
			this.accountbalance = 0; 
		
	}

		public void deposit(int depositamount) {
			if(depositamount <0) {
				accountbalance+=depositamount;
				System.out.println("Deposited: " + depositamount);
	            System.out.println("New Account Balance: " + accountbalance);
	            if(depositamount<=0 || depositamount>accountbalance) {
	            	System.out.println("error");
	            }
	            else {
	                System.out.println("Error: Deposit amount must be positive.");
	            }
		}
		
			
		}
		public void withdraw(int withdrawamount) {
			if(accountbalance<0&&withdrawamount <= accountbalance) {
				accountbalance -= withdrawamount;
		        System.out.println("Withdrew: $" + withdrawamount);
		        System.out.println("New Account Balance: $" + accountbalance);
			}
			else if(withdrawamount > accountbalance) {
        // Error: withdrawal amount exceeds balance
        System.out.println("Error: Insufficient funds. Cannot withdraw more than the current balance.");
		}
			else { // Invalid withdrawal amount
	            System.out.println("Error: Withdrawal amount must be positive.");
		}
		}
			public void displayBalance() {
		        System.out.println("Current Account Balance: $" + accountbalance);
		    }


	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.deposit(2000);   // Deposit $20
        account1.withdraw(30);  // Withdraw $30
        account1.withdraw(50);
        account2.deposit(25000);   // Deposit $20
        account2.withdraw(30);  // Withdraw $30
        account2.withdraw(5);
        account1.displayBalance(); // Final balance of account1
        account2.displayBalance();
        
		// TODO Auto-generated method stub

	}

	

}

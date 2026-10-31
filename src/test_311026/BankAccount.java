package test_311026;

public class BankAccount {

	 int accountNumber;
	 private double balance;
	 
	 public BankAccount(int accountNumber, double balance) {
		 this.accountNumber = accountNumber;
		 this.balance = balance;
	 }

	public double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited : " + amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn: " + amount);
		}
		else {
           System.out.println("Insufficient balance or invalid amount");
       }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount(12345, 10000);
		
		System.out.println("Account Number : " + account.accountNumber);
		
		System.out.println("Initial Balance : " + account.getBalance());
		
		account.deposit(1000);
		account.withdraw(2000);
		
		System.out.println("Final Balance : " + account.getBalance());
		
	}
}

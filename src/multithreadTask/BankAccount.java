package multithreadTask;

// question 2

public class BankAccount {
	
	int balance = 5000;
	
	synchronized void withdraw(int amount) {
		if(amount <= balance && amount >0) {
			balance = balance - amount;
			
			System.out.println("Withdrawal amount is " + amount + " successful");
		}	
		else {
			System.out.println("Insufficient balance and u r balance is " + balance);
		}
	}
	
	
	public static void main(String[] args) {
		
		BankAccount bankAccount = new BankAccount();
		
		Thread t1 = new Thread(()->{
			bankAccount.withdraw(4000);
			System.out.println("Thread 1");
		});
		
		Thread t2 = new Thread(()->{
			bankAccount.withdraw(4000);
			System.out.println("Thread 2");
		});
		
		t1.start();
		t2.start();
	}
}

package p1;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	public void deposite(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Deposited:" + amount);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrew:" + amount);
		}else {
			System.out.println("Invalid or insufficient balance for withdrawal");
		}
	}
	
	public void displayBalance() {
		System.out.println("Current balance:" + balance);
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		account.deposite(500);
		account.withdraw(200);
		account.displayBalance();
	}
}

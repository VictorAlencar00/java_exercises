package entities;

public class BankAccount {
	private String owner;
	private int account_number;
	private double balance;
	
	
	public BankAccount(String owner, int account_number) {
		super();
		this.owner = owner;
		this.account_number = account_number;
	}
	
	public BankAccount(String owner, int account_number, double initialDeposit) {
		super();
		this.owner = owner;
		this.account_number = account_number;
		this.deposit(initialDeposit);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double balance) {
		this.balance = (this.balance - balance) - 5;
	}
	
	public String toString() {
		return 
				"Account: " + account_number + 
				", Holder: " + owner + 
				", Balance: $" + 
				String.format("%.2f", balance);

	}
	
}

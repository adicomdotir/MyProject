package ir.javacup.test;

public class CheckingAccount extends BankAccount {
	private double overdraftAmount;
	public CheckingAccount(String customerNationalId, String accountNumber, double balance, double overdraftAmount) {
		super(customerNationalId, accountNumber, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public double getOverdraftAmount() {
		return this.overdraftAmount;
	}
}
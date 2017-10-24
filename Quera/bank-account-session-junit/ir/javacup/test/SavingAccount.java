package ir.javacup.test;

public class SavingAccount extends BankAccount {
	private double interestAmount;

	public SavingAccount(String customerNationalId, String accountNumber, double balance, double interestAmount) {
		super(customerNationalId, accountNumber, balance);
		this.interestAmount = interestAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}
	
	public void addInterest() {
		double balance = this.getBalance();
		this.deposit(balance * this.interestAmount);
	}
}
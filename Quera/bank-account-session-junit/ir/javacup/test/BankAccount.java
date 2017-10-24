package ir.javacup.test;

public class BankAccount {
	private String customerNationalId;
	private String accountNumber;
	private double balance;


	public BankAccount(String customerNationalId, String accountNumber, double balance) {
		this.customerNationalId = customerNationalId;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getCustomerNationalId() {
		return customerNationalId;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double change) throws RuntimeException {
		if (change > 0) {
			if (this.balance - change >= 0) {				
				this.balance -= change;
			} else {
				throw new RuntimeException("Your balance is not enough");
			}
		} else {
			throw new IllegalArgumentException("Sorry, you can not withdraw a negative amount");
		}
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (customerNationalId == null) {
			if (other.customerNationalId != null)
				return false;
		} else if (!customerNationalId.equals(other.customerNationalId))
			return false;
		return true;
	}
}
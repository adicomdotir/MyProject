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
}
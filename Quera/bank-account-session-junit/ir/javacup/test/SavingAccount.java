public class SavingAccount extends BankAccount {
	private float interestAmount;

	public SavingAccount(String customerNationalId, String accountNumber, double balance, float interestAmount) {
		Super(customerNationalId, accountNumber, balance);
		this.interestAmount = interestAmount;
	}

	public float getInterestAmount() {
		return interestAmount;
	}
}
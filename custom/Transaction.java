package custom;

public class Transaction {

	public float balance;

	public void deposit(float amount) throws NegativeAmountException {

		if (amount < 0) {
			throw new NegativeAmountException();
		} else {
			balance += amount;
			System.out.println("New Balance= " + balance);
		}
	}

	public void withdraw(float amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException();
		} else {
			balance -= amount;
			System.out.println("New Balance= " + balance);
		}
	}

}

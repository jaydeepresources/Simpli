package custom;

public class TestCustomException {

	public static void main(String[] args) {

		Transaction t = new Transaction();
		t.balance = 10000;

		try {
			t.deposit(1000);
		} catch (NegativeAmountException ne) {
			ne.printMessage();
		}

		try {
			t.withdraw(1000);
		} catch (InsufficientBalanceException ie) {
			ie.printMessage();
		}

	}

}
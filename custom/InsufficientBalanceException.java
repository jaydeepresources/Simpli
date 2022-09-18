package custom;

public class InsufficientBalanceException extends Exception{
	
	public void printMessage() {
		System.out.println("The amount must not exceed balance.");
	}

}

package custom;

public class NegativeAmountException extends Exception{
	
	public void printMessage() {
		System.out.println("The amount must be positive.");
	}

}

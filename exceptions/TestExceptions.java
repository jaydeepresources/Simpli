package exceptions;

public class TestExceptions {

	static void foo() throws ArithmeticException {
		int x = 10 / 0;
	}

	public static void main(String[] args) {

//		try {
//			int x = 10 / 10;
//			System.out.println(x);
//
//			String s = "";
//			s = s.concat("123");
//		} catch (ArithmeticException ae) {
//			System.out.println("Can't divide by 0");
//		} catch (NullPointerException np) {
//			System.out.println("String can't be null");
//		}
//		finally {
//			System.out.println("Always !");
//		}

		foo();

	}

}

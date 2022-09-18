package threads;

public class TestThreads {

	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();

	}

}

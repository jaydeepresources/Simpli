package threads;

public class ThreadB extends Thread {

	@Override
	public void run() {
		// threading logic to go here !

		System.out.println("Entering Thread B");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread B: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Thread B");

	}

}

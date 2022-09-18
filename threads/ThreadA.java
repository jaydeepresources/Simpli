package threads;

public class ThreadA extends Thread {

	@Override
	public void run() {
		// threading logic to go here !

		System.out.println("Entering Thread A");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread A: " + i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting Thread A");

	}

}

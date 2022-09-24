package concurrency;

public class TestConcurrency {

	public static void main(String[] args) {
		
		TicketThread[] threads = new TicketThread[12];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new TicketThread();
			threads[i].start();
		}

	}

}

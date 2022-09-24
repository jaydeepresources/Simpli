package concurrency;

public class TicketThread extends Thread {

	static int total = 10;

	public static synchronized void bookTicket() { //  make it operate under ME
		System.out.println("Starting to book ticket");
		if (total == 0)
			System.out.println("Tickets unavailable.");
		else {
			total--;
			System.out.println("Tickets Remaining: " + total);
		}
		System.out.println("Process complete");
	}

	@Override
	public void run() {
		bookTicket();
	}

}

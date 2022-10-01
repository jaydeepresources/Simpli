package queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue q = new Queue();

		q.deQueue();

		for (int i = 1; i < 6; i++) {
			q.enQueue(i);
		}

		q.enQueue(6);

		q.display();

		q.deQueue();

		q.display();

	}

}

package queue;

public class Queue {
	int SIZE = 5;
	int items[] = new int[SIZE];
	int front, rear;

	Queue() {
		front = -1;
		rear = -1;
	}

	boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}
		return false;
	}

	boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
	}

	void enQueue(int element) {

		if (isFull()) {
			System.out.println("Queue is full");
			System.exit(1);
		} else {
			if (front == -1) {
				front = 0;
			}

			rear++;
			items[rear] = element;
			System.out.println("Insert " + element);
		}
	}

	int deQueue() {
		int element;

		if (isEmpty()) {
			System.out.println("Queue is empty");
			return (-1);
		} else {
			element = items[front];

			if (front >= rear) { // if queue is empty after deQueue
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println(element + " Deleted");
			return (element);
		}
	}

	void display() {
		int i;
		if (isEmpty()) {
			System.out.println("Empty Queue");
			System.exit(1);
		} else {
			System.out.println("\nFront index-> " + front);

			System.out.println("Items -> ");
			for (i = front; i <= rear; i++)
				System.out.print(items[i] + "  ");

			System.out.println("\nRear index-> " + rear);
		}
	}

}
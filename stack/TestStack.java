package stack;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the size of the stack");
		int size = s.nextInt();

		Stack stack = new Stack(size);
		int choice = 0;
		do {

			System.out.println("1. Push an element");
			System.out.println("2. Pop an element");
			System.out.println("3. Check if Empty");
			System.out.println("4. Check if Full");
			System.out.println("5. Print the Stack");
			System.out.println("Please enter the choice.");

			int ch = s.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter the element to be pushed");
				int data = s.nextInt();
				stack.push(data);
				stack.printStack();
				break;

			case 2:
				int i = stack.pop();
				System.out.println("Popped Element= " + i);
				stack.printStack();
				break;

			case 3:
				System.out.println("Stack Empty= " + stack.isEmpty());
				break;

			case 4:
				System.out.println("Stack Full= " + stack.isFull());
				break;

			case 5:
				stack.printStack();

			default:
				System.out.println("Choice is invalid");

			}
			System.out.println("1.Re Run\t2.Exit");
			choice = s.nextInt();
		}

		while (choice == 1);
	}

}

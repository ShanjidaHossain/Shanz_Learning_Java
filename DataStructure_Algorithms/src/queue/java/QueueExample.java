package queue.java;
// Java program to demonstrate a Queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to the queue
		for (int i = 1; i < 5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("Elements of queue:  " + q);

		// To remove the head of queue.
		int removeElement = q.remove();
		System.out.println("removed element: " + removeElement);

		System.out.println(q);

		// To view the head of queue
		int head = q.peek();
		System.out.println("head of queue: " + head);

		// Rest all methods of collection interface like size and contains can be used
		// with this implementation.
		int size = q.size();
		System.out.println("Size of queue: " + size);
	}
}

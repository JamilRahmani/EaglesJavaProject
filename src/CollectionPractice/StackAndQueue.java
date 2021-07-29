package CollectionPractice;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackAndQueue {

	public static void main(String[] args) {


		/*
		 * Stacks are based on the LIFO principle, i.e., the element inserted at the
		 * last, is the first element to come out of the list. Queues are based on the
		 * FIFO principle, i.e., the element inserted at the first, is the first element
		 * to come out of the list.
		 */
		
		// stack you can add data to your stack, once you pop a value,
		// it will return and remove the one one on the top
		// LIFO
		
		Stack<String> data = new Stack<String>();
		data.add("1");
		data.add("2");
		data.add("3");
		
		System.out.println(data);
		System.out.println(data.pop());
		System.out.println(data);
		System.out.println("*********************************");
		
		// queue is based on FIFO which means that the first element that you added
		// is the element you will get if you poll
		
		PriorityQueue<String> tempdata = new PriorityQueue<String>();
		tempdata.add("1");
		tempdata.add("2");
		tempdata.add("3");
		
		System.out.println(tempdata);
		System.out.println(tempdata.poll());
		System.out.println(tempdata);

		
		
		
	}

}

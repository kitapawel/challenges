package challenges_gs_24;

import java.util.*;

public class ImplementDeque_004 {

	public static void main(String[] args) {
		
		Deque<String> deque = new LinkedList<String>();		
		deque.add("Paul");
		deque.add("Tom");
		deque.add("Dan");
		deque.add("Ron");
		
		System.out.println("The basic deque is: " + deque);
		
		deque.addFirst("Abel");
		System.out.println("AddFirst on deque: " + deque);
		deque.addLast("Zabel");
		System.out.println("AddLast on deque: " + deque);
		
		System.out.println("Popping the deque: " + deque.pop() + ". Deque after popping: " + deque);
		
		System.out.println("Polling the deque: " + deque.poll() + ". Deque after polling: " + deque);
		
		System.out.println("Popping the last element of the deque: " + deque.pollLast() + " . Deque after polling last: " + deque);
		
		Iterator iterator = deque.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Iterating over deque elements: " + iterator.next());
		}
	}
	

	
	
}

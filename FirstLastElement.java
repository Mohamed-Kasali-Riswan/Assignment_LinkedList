package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class FirstLastElement {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println("First element is "+list.getFirst());
		System.out.println("Last element is "+list.getLast());
		
	}
}

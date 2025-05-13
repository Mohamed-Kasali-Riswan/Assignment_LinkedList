package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReversedLinkedList {

	public static void main(String[] args) {

		LinkedList<Character> list = new LinkedList<>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		
		System.out.println("Original List is "+list);
		
		LinkedList<Character> reversedList = new LinkedList<>();
		
		ListIterator<Character> iterator = list.listIterator(list.size());
		
		while(iterator.hasPrevious()) {
			reversedList.add(iterator.previous());
		}
		
		System.out.println("Reversed List is "+reversedList);
		

	}

}

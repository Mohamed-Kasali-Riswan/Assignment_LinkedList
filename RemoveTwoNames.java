package linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class RemoveTwoNames {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
        
        	list.add("Alice");
        	list.add("Bob");
        	list.add("Charlie");
        	list.add("Diana");
        
        	System.out.println("Initial LinkedList: " + list);
        
        	if (!list.isEmpty()) list.removeFirst();
        	if (!list.isEmpty()) list.removeFirst();
        
        	System.out.println("LinkedList after removing two names: " + list);
	}
}

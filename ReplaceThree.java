package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceThree {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		ListIterator<String> iterator = list.listIterator();
		
		System.out.println("OG list is "+list);
		
		while(iterator.hasNext()) {
			String value = iterator.next();
			if(value.equals("three")) iterator.set("THREE");
			
		}
		
		System.out.println("Modified list is "+list);

		
	}
	
}

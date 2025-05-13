package linkedlist;

import java.util.LinkedList;

public class RemoveLastAndIndex2 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
		System.out.println(list.remove(2));
		System.out.println(list.removeLast());
		
		System.out.println(list);

	}

}

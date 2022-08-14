package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Pooja");
		ll.add('P');
		ll.add("Pooja");
		ll.add(null);
		ll.add(123);
		ll.add(123.24);
		ll.add(null);

		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(123));

		// peek()-Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(ll.peek());
		System.out.println("==O/p of peek()==" + ll);

		System.out.println(ll.peekFirst());
		System.out.println("==O/p of peekFirst()==" + ll);

		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println("=========================================");
		// poll()-Retrieves, and removes the head (first element) of this list.

		System.out.println(ll.poll());
		System.out.println(ll);

		System.out.println(ll.pollLast());
		System.out.println(ll);
		System.out.println("=================================");
		for (Object m : ll) {
			System.out.println(m);
		}
		System.out.println("=================================");
		Iterator i = ll.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}

package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();// created object of arraylist
		al.add("Velocity");
		al.add(124);
		al.add(121.20);
		al.add(null);
		al.add(null);
		al.add("Velocity");
		al.add("true");
		al.add('P');

		System.out.println(al);// we get array list(index+1)
		System.out.println(al.size());// Get size means length of string
		System.out.println(al.get(4));// get element at specified position of index return type is element
		System.out.println();

		System.out.println(al.indexOf(124));// we get index position of first occurance of spec. list
		System.out.println(al.indexOf("true"));
		System.out.println(al.lastIndexOf(null));
		System.out.println();

		System.out.println(al.contains('P'));//If list contain specified element then return true
		System.out.println(al.remove(5));// Remove the element at specified position of list
		/*
		 * al.add(1,"Pune"); System.out.println(al);
		 */

		al.add(3, "New Element");
		System.out.println(al);
		System.out.println();

		// Printing array in list
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("=============================");

		// Printing element by using for loop-->(static coding or hard coding)
		// for each loop
		System.out.println("for loop output");
		for (int i = 0; i <= 7; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=============================");

		System.out.println("for loop by dyanamic coding output");

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=============================");
		

		System.out.println("for each loop");
		for (Object x : al) {
			System.out.println(x);
		}
		System.out.println("=============================");
		
		
		System.out.println("By using iterator");
		Iterator it = al.iterator();
		while (it.hasNext()) {			//hasNext() will check next element is present or not.
			System.out.println(it.next());//next() will push fwd.
		}
		System.out.println("=============================");
		
		
		System.out.println("By using listiterator");
		ListIterator x2 = al.listIterator();
		while (x2.hasNext()) {
			System.out.println(x2.next());
		}
	}

}

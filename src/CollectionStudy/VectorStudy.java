package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		Vector v = new Vector();//create obj of vector

		v.add(123);
		v.add("Pooja");
		v.add(null);
		v.add("Pooja");
		v.add('P');
		v.add(122.24);
		v.add(null);

		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.indexOf(null));
		System.out.println(v.lastIndexOf("Pooja"));
		System.out.println(v.get(2));
		System.out.println(v.contains('P'));
		v.add(2, "Devadiga");
		System.out.println(v);
		System.out.println("============================");
		System.out.println("Using for loop");

		for (int i = 0; i <= 6; i++) {
			System.out.println(v.get(i));
		}
		System.out.println("============================");
		
		System.out.println("Using for each loop");

		for (Object F : v) {
			System.out.println(F);
		}
		System.out.println("============================");
		
		System.out.println("Using iterator");
		Iterator it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("============================");
		
		System.out.println("Using for ListIterator");
		ListIterator li = v.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("============================");
		System.out.println("Using enumeration");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

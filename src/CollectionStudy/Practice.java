package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add("Pooja");
		al.add(null);
		al.add(123);
		al.add(null);
		al.add(123.5);
		al.add("Pooja");
		al.add('P');
		
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.indexOf(null));
		System.out.println(al.lastIndexOf("Pooja"));
		al.add(2,'N');
		System.out.println(al);
		
		// clone()-Returns a shallow copy of this ArrayList instance. 
		//(The elements themselves are not copied.)
		System.out.println(al.clone());
		System.out.println(al.contains(123.5));
		System.out.println(al.isEmpty());//Returns true if this list contains no elements
		System.out.println("====================================================================");
		
		//for loop
		
		for(int i=0;i<=7;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("====================================================================");
		
		//for each loop
		
		for(Object y:al)
		{
			System.out.println(y);
		}
		System.out.println("====================================================================");
		
		//iterator
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("====================================================================");
		//listiterator
		
		ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}

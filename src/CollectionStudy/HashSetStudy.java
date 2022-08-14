package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet<>();//Create obj of Hashset
		
		hs.add("Pune");
		hs.add('P');
		hs.add(123);
		hs.add("Pune");
		hs.add(null);
		hs.add(125.12);
		hs.add(null);
		hs.add("true");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("Pune"));
		System.out.println(hs.remove('P'));
		System.out.println(hs);
		System.out.println("=================================");
		
		for(Object H:hs)
		{
			System.out.println(H);
		}
		System.out.println("=================================");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

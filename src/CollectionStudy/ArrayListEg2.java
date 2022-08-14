package CollectionStudy;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg2 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		System.out.println(al);
		System.out.println("=================================");

		System.out.println("For loop");
		for (int i = 0; i <= 3; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("=================================");

		System.out.println("for each loop");
		for (Integer P : al) {
			System.out.println(P);
		}
		System.out.println("=================================");
		System.out.println("Iterator");

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

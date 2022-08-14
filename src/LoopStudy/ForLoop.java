package LoopStudy;

public class ForLoop {

	public static void main(String[] args) {
		// 5 table using For Loop

		// initialization:int a=5;
		// Condition : a<=50;
		// Updation : a=a+5;

		for (int a = 5; a <= 50; a = a + 5) {
			System.out.println(a);
		}
		System.out.println("========================");

		// For horizontal print

		for (int a = 5; a <= 50; a = a + 5) {
			// System.out.print(a + " ");
			System.out.print(" " + a);

		}
		System.out.println();
		System.out.println("========================");

		// 5 table in decreasing order

		for (int x = 50; x >= 5; x = x - 5)

		{
			System.out.println(x);
		}
		System.out.println();
		System.out.println("========================");

		// 5 table in decreasing order
		System.out.println("Decreasing order of table is ");

		for (int i = 50; i >= 5; i=i-5)

		{
			System.out.print(" "+i);
			
			
		}

	}

}

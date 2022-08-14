package ImportantProgram;

public class Large_Number_fromArray {

	public static void main(String[] args) {

		int a[] = { 20, 30, 90, 110, 2, 15 };
		int size, temp;
		size = a.length;

		for (int i = 0; i < size; i++) {

			for (int j = 1; j < size; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		
		System.out.println("Largest number is "+a[1]);
	}

}

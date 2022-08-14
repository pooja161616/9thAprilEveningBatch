package ImportantProgram;

public class Find_2ndLargestNumber_UsingArry {

	public static void main(String[] args) {
		// 15,14,20,4,7,9
		// initially i=0;j=1;check the condition @line 22

		// int a[] = { 15, 14, 20, 4, 7, 9, 19 };

		int a[] = { 82, 14, 80, 4, 7, 9, 20 };
		int temp, size;// variable declaration
		
		size = a.length;

		for (int i = 0; i < size; i++) { // for rows

			for (int j = 1; j < size; j++) { // for coloumns

				if (a[i] > a[j]) {						//for smallest change if (a[i] < a[j])
					// swaping the number
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("2nd Highest number is " + a[2]);// for finding largest element change the index number
	}

}

package ImportantProgram;

public class Palindrom_Number {

	public static void main(String[] args) {
		// The number that remains change when its digits are reversed 121 reverse 121
		// 535 1221
		// concept is reverse number

		int a = 1223221;
		int no = a; // store no in temp variable
		int reverse = 0;
		while (a != 0)// temp var is not equal to 0
		{
			int reminder = a % 10; // 1223221/10
			reverse = reverse * 10 + reminder;
			a = a / 10;
		}
		System.out.println(reverse);
		if (reverse == no) {
			System.out.println("Palendrom");
		} else {
			System.out.println("No Palendrom");
		}

	}

}

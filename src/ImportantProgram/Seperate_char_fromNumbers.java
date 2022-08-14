package ImportantProgram;

public class Seperate_char_fromNumbers {

	public static void main(String[] args) {

		String s = "123abcd4567";
		String number = " ", letter = " ";
		for (int i = 0; i <= s.length() - 1; i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				number = number + c;
			} else {
				letter = letter + c;
			}
		}
		System.out.println(number);
		System.out.println(letter);

	}
}

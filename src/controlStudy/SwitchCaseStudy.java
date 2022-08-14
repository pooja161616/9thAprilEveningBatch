package controlStudy;

public class SwitchCaseStudy {

	public static void main(String[] args) {

		// if year is 1 --> Welcome to 1st year engg
		// if year is 2 --> Welcome to 2nd year engg
		// if year is 3--> Welcome to 3rd year engg
		// if year is 4--> Welcome to 4th year engg
		// if not within 1-4--> Plz enter valid year between 1-4

		/*
		 * switch(expression){ 
		 * case x: 
		 * code block; 
		 * break; 
		 * case y: 
		 * code block; 
		 * break;
		 * default:
		 * code block;
		 * }
		 * 
		 */

		int Year = 2;
		switch (Year) {
		case 1:
			System.out.println("Welcome to 1st year engg");
			break;
		case 2:
			System.out.println("Welcome to 2nd year engg");
			break;
		case 3:
			System.out.println("Welcome to 3rd year engg");
			break;
		case 4:
			System.out.println("Welcome to 4th year engg");
			break;

		default:
			System.out.println("Plz enter valid year between 1-4");
			break;
		}

	}

}

package Logic_Programs;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);//Taking user i/p
		System.out.println("Please Enter number");
		sc.nextInt();//it takes int value
		System.out.println("Please Enter string");
		sc.next();//it take string value
		
		System.out.println("=======================================");
		
		//Addition of two numbers
		
		System.out.println("Please enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int num2 = sc.nextInt();
		int sum=num1+num2;
		System.out.println("Addition of two number is "+sum);
		
		
	}

}

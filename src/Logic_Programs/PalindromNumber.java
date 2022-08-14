package Logic_Programs;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {

		String s="nitin";
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r)) {
			
			System.out.println("String is Palindom");
		}
		else
		{
			System.out.println("String is not Palindrom");
		}
		
		System.out.println("==================================");
		
		//For numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter number/string");
		String s1 = sc.nextLine();
		String b="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			b=b+s1.charAt(i);
			
		}
		
		System.out.println();
		if(s1.equals(b)) {
			
			System.out.println("Number is Palidrom");
		}
		else {
			
			System.out.println("Number is not Palindrom");
		}
		
	

	}
}

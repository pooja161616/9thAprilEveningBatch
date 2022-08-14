package Logic_Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Velocity -->yticolev
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide String");
		String s = sc.next();
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {// 7,6,5....0

			r = r + s.charAt(i);
			// y=""+y;
			// yt=y+t;
			// r=yticoleV
		}

		System.out.println("Reverse number is " + r);

	
	
	
	String a="Pooja";
	String t="";
	for(int i=a.length()-1;i>=0;i--) {
		
		t=t+a.charAt(i);
		
	}
	System.out.println("Reverse of "+ a +" is "+ t);

}
}
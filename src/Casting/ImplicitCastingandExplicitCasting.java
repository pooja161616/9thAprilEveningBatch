package Casting;

public class ImplicitCastingandExplicitCasting {

	public static void main(String[] args) {
		
		//implicit casting:Conerting lower data type of information into higher data type of info is called implicit casting 
		int a=10;//size=4byte
		System.out.println(a);
		
		double b=a;//size=8byte
		System.out.println(b);
		
		//Explicit casting : Converting higher data type of info into lower data type

		double c=132.1345;//size=8byte
		System.out.println(c);
		 int d=(int) c;//adding casting variable (int) size=4byte
		 System.out.println(d);
	}

}

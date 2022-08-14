package Casting;

public class ImplicitCasting {

	public static void main(String[] args) {
		
		//Implicit Casting
		int a=100;// size = 4byte
		System.out.println(a);
		
		double b=a; // size =8byte
		System.out.println(a);
		System.out.println("==================================");
		//Explicit Casting
		double c=123.123;
		System.out.println(c);
		
		int d=(int) c;
		System.out.println(d);
	}

}

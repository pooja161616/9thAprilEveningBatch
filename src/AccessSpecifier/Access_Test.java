package AccessSpecifier;

public class Access_Test {

	public static void main(String[] args) {
		Private_Use pu=new Private_Use();
		//pu.add();
		pu.sub();
		pu.mul();
		System.out.println("value of a is "+pu.a);
		//System.out.println("Value of b is "+pu.b);
		System.out.println("Value of c is "+pu.c);
		System.out.println("Value of d is "+pu.d);

	}

}

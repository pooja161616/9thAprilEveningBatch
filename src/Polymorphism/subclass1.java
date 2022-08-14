package Polymorphism;

public class subclass1 extends methodoverrid1{

	public static void main(String[] args) {
		subclass1 s=new subclass1();
		s.care();
		methodoverrid1 m=new methodoverrid1();
		m.care();
	
		
	}
	
	public void care()
	{
		System.out.println("case is subclass method");
	}

}

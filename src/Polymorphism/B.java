package Polymorphism;

public class B extends MethodOverriding
	{

	public static void main(String[] args) {
		
		B b =new B();
		MethodOverriding m=new MethodOverriding();
		b.add();
		m.add();
		

	}
	public void add()
	{
		System.out.println("This is add method of B class");
	}

}

package AccessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		// To call access specifier need to create object of same class
		PrivateUse p=new PrivateUse();
		p.test1();//public can access within Project only
		p.test2();//Private can access within class only
		p.test3();//Default can access within package only
		

	}
	public void test1()
	{
		System.out.println("public test1 method");//Public can be access 
		                                            //within Project
	}
	private void test2()
	{
		System.out.println("private test2 method");//private can be access within class
	}
	void test3()
	{
		System.out.println("Default test3 method");//Default can be access within Package
	}

}

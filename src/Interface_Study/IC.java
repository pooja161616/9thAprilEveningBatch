package Interface_Study;

	/*  1.Create implement class
		2.Use implements keyword and call interface
		3.Error shows below implement class name  then either
		make it abstract or add unimplemented method
		4.Complete definition of method body in class  */

public class IC implements MyInterface {

	public static void main(String[] args) {
		
	IC i=new IC();
	i.test1();
	i.test2();
	i.test3();

	}

	@Override
	public void test1() {
		System.out.println("Test1 method completed in implementation class");
		
	}

	@Override
	public void test2() {
		System.out.println("Test2 method completed in implementation class");
		
	}
	void test3() {
		System.out.println("Test1 method is own method implementation class");
	}

}

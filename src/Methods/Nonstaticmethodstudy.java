package Methods;

public class Nonstaticmethodstudy {

	public static void main(String[] args) {
		
		// 1st we need to create object
		//classname objectname=new classname();
		Nonstaticmethodstudy n=new Nonstaticmethodstudy();//created object name

		//To call non-static method from same class
		//objectname.methodname();
		n.test();
		
		//calling non-static method from another class we need to create object of that class
		
		Myclass m=new Myclass();//created object of class
		
		//To call object from another method
		
		m.mymethod();
	}
	
	
	//call nonstatic regular method
	
	public void test()
	
	{
		
		System.out.println("This is test method");
	
	}
	
	
	

}

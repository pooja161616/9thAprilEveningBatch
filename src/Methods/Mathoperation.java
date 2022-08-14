package Methods;

public class Mathoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To crate object before create non static regular method
		
		//classname objectname=new classname();
		Mathoperation m=new Mathoperation();
		//calling non static method with the help of object
				m.add();

	}

	
	//To create non static regular method
	public void add()
	
	{
		/*int a;
		int b;
		int addition;
		a=10;
		b=20;
		addition = a+b;
		System.out.println("Addition is "+addition);*/
		
		int a=50;
		int b=35;
		int addition;
		addition=a+b;
		System.out.println("Addition is "+addition);
		
		
		
	}
	
}

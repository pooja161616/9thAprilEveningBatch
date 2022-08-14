package Methods;

public class StaticMethodStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //test2();
       // Sample.display();//static regular method from another class
        sub();//Static regular method from same class

	}
	//In main method 1st execute/declare method name.
	
	/*public static void test2()//Static regular method from same class--->complete method-->Have body
	
	{
		System.out.println("Hi am test2 static Regular method");
	}*/
	
	
	//Static regular method from another class
	//To call non static regular method from same class
	
	
	/*public void test2()//Non Static method from same class 
	{
		System.out.println("This non static test2 method from same class");*/
		
	public static void sub()
	{
		int a=15;
		int b=25;
		int substraction;
		substraction=a-b;
		System.out.println("Substraction is "+substraction);
		
	}

}





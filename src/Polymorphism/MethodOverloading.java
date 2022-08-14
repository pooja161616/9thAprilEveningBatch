package Polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// creating object of class
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(50);
 
	}
	public void add()//zero parameter with non static method 
	{
		int a=20;
		int b=50;
		int sum=a+b;
		System.out.println("Sum is"+sum);
	}
	public void add(int a)//with parameter with nonstatic method
	{
		//a=60;
		int sum=a+60;
		System.out.println("Sum is "+sum);
	}
}

package AccessSpecifier;

public class Private_Use {
	
	int a=20;
	private int b=30;
	protected int c=40;
	protected static int d=60;

	public static void main(String[] args) {
		// To call method create object of class
		Private_Use pu=new Private_Use();
		pu.add();//calling private method allowed within class
		pu.sub();//calling public method allowed within project
		pu.mul();//calling default method allowed within package
		pu.display();//calling protected method allowed within package

	}
	private void  add()//Access specifier private
	{
		int a;
		int b=20;
		int c=10;
		a=c+b;
		System.out.println("Value of a is "+a);
	}
	public void  sub()//Access specifier public
	{
		int a;
		int b=20;
		int c=10;
		a=c-b;
		System.out.println("Value of a is "+a);
	}
		void mul()//Access specifier default
		{
		int a;
		int b=20;
		int c=10;
		a=c*b;
		System.out.println("Value of a is "+a);

		
	}
		protected static void display()//Access specifier protected
		{
			System.out.println("Hi am Prtected method");
		}
}


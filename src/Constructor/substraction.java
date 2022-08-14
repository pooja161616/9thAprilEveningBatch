package Constructor;

public class substraction {

	// Variable Declaration

	int a;
	int b;

	public substraction()// user defined constructor

	{
		a = 120;// variable initialization
		b = 55;

	}

	public static void main(String[] args) {
		substraction s = new substraction();// created object
		s.sub();

	}

	public void sub()

	{
		int sub = a - b;
		System.out.println("The substraction is " + sub);
	}

}

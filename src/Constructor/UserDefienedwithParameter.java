package Constructor;

public class UserDefienedwithParameter {

	int a;// Variable declaration Globally
	int b;
	int c;

	// Constructor
	public UserDefienedwithParameter()// Without parameter constructor
	{
		a = 20;
		b = 30;// assign value to variable
		c = 40;
	}

	public UserDefienedwithParameter(int x)// constructor with single parameter
	{
		a = x;
		// b=default value
		// c=default value

	}

	public UserDefienedwithParameter(int x, int y)// constructor with 2 parameter
	{
		a = x;
		b = y;
		// c is default value
	}

	public UserDefienedwithParameter(int x, int y, int z)// constructor with 3 parameter
	{

		a = x;
		b = y;
		c = z;
	}

	// Main method
	public static void main(String[] args) {

		UserDefienedwithParameter ud = new UserDefienedwithParameter();// Zero parameter constructor
		ud.addition();
		UserDefienedwithParameter ud1 = new UserDefienedwithParameter(50);// User defined single parameter constructor
		ud1.addition();
		UserDefienedwithParameter ud2 = new UserDefienedwithParameter(15, 30);
		ud2.addition();
		UserDefienedwithParameter ud3 = new UserDefienedwithParameter(20, 30, 50);
		ud3.addition();
	}

	public void addition()// Non-static method without parameter same class

	{
		int sum = a + b + c;
		System.out.println("Sum is " + sum);

	}

}

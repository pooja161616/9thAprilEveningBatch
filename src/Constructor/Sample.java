package Constructor;

public class Sample {
	int a;// Variable declaration
	int b;
	String name;
	char gender;

	public Sample()// user defiened constructor

	{

		a = 20;
		b = 10;
		name = "Pooja";
		gender = 'F';// variable Initialization

	}

	public static void main(String[] args) {
		// To create object of Sample class
		Sample s = new Sample();
		s.add();
	}

	public void add() {
		int sum = a + b;
		System.out.println("Name is " + name);
		System.out.println("Gender is " + gender);
		System.out.println("Addition of user defined constructor is " + sum);
	}
}

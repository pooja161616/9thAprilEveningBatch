package variableType;

public class GlobalAndLocalVariable {

	int a = 24;// Non static global variable
	static int b = 50;// Static global variable

	public static void main(String[] args) {

		GlobalAndLocalVariable g = new GlobalAndLocalVariable();// object created for non static variable
		g.test();// Calling non-static method from same class
		System.out.println("Global value of a is " + g.a);// Non static global variable from same class
		System.out.println("Global value of b is " + b);// static global variable from same class
		int add = g.a + 100;// Usage of non static variable from same class
		int sub = 200 - b;// Usage of satic variable from same class
		// Calling nonstatic variable from another class
		// Create object from another class(Sample class)
		Sample s = new Sample();
		System.out.println("Value of ns variable from another class is " + s.p);
		System.out.println("Value of s variable from another class is " + Sample.q);
	}

	public void test() {
		// Static Local variable
		int a = 10;
		int add = a + 100;
		System.out.println("Addition is " + add);
	}

}

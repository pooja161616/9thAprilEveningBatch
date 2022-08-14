package AbstractClass;

public abstract class A { // class declare with abstract keyword

	public static void main(String[] args) {
		
		// A a=new A();

	}

	public void test1()// complete method
	{
		System.out.println("This is test1");
	}

	public void test2()// complete method
	{
		System.out.println("This is test2");
	}

	public abstract void test3();// incomplete method(abstract method)

	public abstract void test4();// incomplete method
}

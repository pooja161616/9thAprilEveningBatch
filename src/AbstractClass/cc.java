package AbstractClass;

public class cc extends A {

	public static void main(String[] args) {

		cc c = new cc();
		c.demo1();
		c.demo2();
		c.test1();
		c.test2();
		c.test3();
		c.test4();

	}

	public void demo1() {
		System.out.println("demo1 is method of cc class");
	}

	public void demo2() {
		System.out.println("demo2 is method of cc class");
	}

	@Override // which provide definition to incomplete method
	public void test3() {
		System.out.println("test3 is complete method");

	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub

	}

}

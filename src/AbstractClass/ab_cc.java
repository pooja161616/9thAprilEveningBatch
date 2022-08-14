package AbstractClass;

public class ab_cc extends ab {

	public static void main(String[] args) {
		ab_cc ab=new ab_cc();
		ab.test1();
		ab.test2();
		ab.test3();
		
	}

	@Override
	public void test2() {
		System.out.println("This is test2");
	}

	@Override
	public void test3() {
		System.out.println("This is test3");
		
	}

}

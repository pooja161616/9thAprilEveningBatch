package ThisAndSuperKeyword;

public class ThisUse {
	int a = 100;// non-static global variable
	int b = 200;

	public void main(String[] args) {
		// This keyword is used access Global variable from same/current
		ThisUse t = new ThisUse();
		t.test();
	}

	public void test() {
		int a = 20;// local variable
		int sum = a + 150;// a is local variable
		System.out.println(sum);

		int sum1 = this.a + 150;
		System.out.println(sum1);

		System.out.println("local value of a is " + a);// Local Variable
		System.out.println("Global value of a is " + this.a);// Global Variable
		System.out.println(b);
	}
	
	

}

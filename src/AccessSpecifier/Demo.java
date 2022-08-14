package AccessSpecifier;

public class Demo {

	public static void main(String[] args) {
		//To create object of another PrivateUse Class
		PrivateUse pu=new PrivateUse();
		pu.test1();
		//pu.test2();//is private method so not visible in another class
		pu.test3();

	}

}

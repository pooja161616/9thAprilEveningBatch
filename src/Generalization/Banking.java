package Generalization;

public class Banking {

	public static void main(String[] args) {
		Axis a=new Axis();
		BOI b=new BOI();
		a.axisApp();
		a.deposite();
		a.transfer();
		a.loan();
		System.out.println("=================================");
		
		b.BOIStarApp();
		b.deposite();
		b.loan();
		b.transfer();
		System.out.println("=================================");

	}

}

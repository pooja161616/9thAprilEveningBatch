package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// To call non static method from another class
		Son s =new Son();
		s.mobile();//using son class calling sons method
		s.nature();//Using son class calling mothers method
		s.story();//Using son class calling Grandmother method
		
		System.out.println("========================================");
		
		//To call static method from another class classname.methodname();
		Son.laptop();
		Son.look();
		Son.Receipe();
	}

}

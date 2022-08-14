package Casting;

public class Upcasting {

	public static void main(String[] args) {
		Father f = new Father();// object creation of father
		Son s = new Son();// Boject creartion of son

		f.car();
		f.bike();
		System.out.println("=============================");

		s.car();
		s.bike();
		s.degree();
		System.out.println("===============================");
		// superclass name object name=new subclass

		Father f1 = new Son(); /*
								 * Upcasting : Creating object of subclass and giving superclass reference
								 */
		f1.bike();// the o/p i.e. properties consider only of subclass which is inherited from
					// uper class
		f1.car();

	}

}

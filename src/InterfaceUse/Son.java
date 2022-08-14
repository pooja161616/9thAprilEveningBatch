package InterfaceUse;

public class Son implements Father,Mother//Multiple Inheritance
{

	public static void main(String[] args) {
	Son s=new Son();
	s.flat();
	s.money();
	s.nature();
	s.kind();
	s.care();

	}

	@Override
	public void money() {
		System.out.println("Fathers money completed in son class");
		
	}

	@Override
	public void flat() {
		System.out.println("Fathers Flat completed in son class");
		
	}

	@Override
	public void nature() {
		System.out.println("Mothers nature completed in son class");
		
	}
	
	@Override
	public void kind() {
		System.out.println("Mothers kind completed in son class");
		
	}
	/*to achieve multiple inheritance 
	 * Declare one common property i.e.method in both interfaces(father and mother)
	 * use default keyword infront of method in interface i.e.default void
	 * 1.To create method in implementation  class and provide printing statement otherwise
	 * 2.When will click on error which appears below class name
	 *  then click option override default method.
	 */
	@Override
	public void care() {
		// TODO Auto-generated method stub
		Father.super.care();//calling mothers care method
		Mother.super.care();//calling fathers care method
	}

}

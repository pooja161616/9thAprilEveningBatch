package Generalization;

public class Axis implements RBI {

	@Override
	public void loan() {
		System.out.println("Axis Loan IR-9.5%");
	}

	@Override
	public void deposite() {
		System.out.println("Axis deposit IR-9.8%");
		
	}

	@Override
	public void transfer() {
		System.out.println("Axis have CDM");
		
	}
	public void axisApp(){
		System.out.println("Axis bank own method");
	}

}

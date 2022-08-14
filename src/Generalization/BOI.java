package Generalization;

public class BOI implements RBI{

	@Override
	public void loan() {
		System.out.println("BOI Loan IR-8.5%");
	}

	@Override
	public void deposite() {
		System.out.println("BOI deposit IR-5.8%");
	}

	@Override
	public void transfer() {
		System.out.println("SBI have NEFT, IMPS,RTGS, CDM");
		
	}
	public void BOIStarApp() {
		System.out.println("bOI own method");
	}

}

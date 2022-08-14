package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Mother m=new Mother();//created object of Mother class
		Son s=new Son();//created object of Son class
		m.nature();//Using mothers object calling mothers method
		s.mobile();//Using sons object calling sons method
		s.nature();//Using sons object calling mothers method

	}

}

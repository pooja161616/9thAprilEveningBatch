package InterfaceUse;

public interface Mother {
	
	void nature();//Method name by default Public and static
	void kind();
	
	//Multiple inheritance
	default void care() {
		System.out.println("Mothers Care");
	}
	

}

package InterfaceUse;

public interface Father {
	void money();
	void flat();
	//Multiple inheritance
	default void care()
	{
		System.out.println("Fathers Care");
	}

}

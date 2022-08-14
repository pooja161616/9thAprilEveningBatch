package Interface_Study;

public interface MyInterface {
	// Data member/variable declared inside the interface is by default static
	// and final

	/*
	 * Use of final keyword with variable :If we use final keyword infront of
	 * variable name then we cant update/change the value of variable
	 * :final keyword infront of method name we cannot override that method with
	 * class : final keyword infront of class name we cant extend that class with
	 * another class.
	 */
	int a = 30;

	// Method declared inside the interface is by default Public and Abstract

	void test1();

	void test2();

}

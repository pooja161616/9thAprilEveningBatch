package Constructor;
     //user defined constructor without parameter/zero parameter
    public class Mathoperation {
	
	int a;//variable declaration
	int b;
	
	
public Mathoperation()//Constructor declaration

{
	a=50;//variable initialization
	b=30;
	
}
	public static void main(String[] args) {
		
        Mathoperation m=new Mathoperation();//created object of class
        m.add();
	}
	
	public void add()
	{
		int add=a+b;
		System.out.println("The addition is "+add);
	}

}

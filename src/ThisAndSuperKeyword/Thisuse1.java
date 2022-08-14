package ThisAndSuperKeyword;

public class Thisuse1 {
	
	int a=10;//Global Variable
	int b=30;
	

	public static void main(String[] args) {
		Thisuse1 t=new Thisuse1();
		t.demo();
		
		
	}
	
	public void demo()
	{
		int a=30;//local variable
		int sum=a+150;
		System.out.println(sum);
		
		int sum1=this.a+200;
		System.out.println(sum1);
		
		System.out.println("Sumof local variable is "+a);
		System.out.println("Sum of global variable is "+this.a);
		System.out.println(b);
	}


}

package ImportantProgram;

public class EvenandOddnumber {

	public static void main(String[] args) {
		// 15

		int i = 15;

		if (i % 2 == 0) {

			System.out.println("Number is Even");

		}
		else
		{
			System.out.println("number is odd");
		}
		
		
		System.out.println("==========================");
		
		//Given number is divisible by 2,5,9 number is 1 to 50
		
		for(int a=1;a<=50;a++)
		{
			if(a%2==0 || a%5==0 || a%9==0)
			{
				System.out.print(a+" ");
			}
			
		}
		System.out.println();
	}
	
	

}

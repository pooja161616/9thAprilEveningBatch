package NumberProgramUsingForLoop;

public class Pattern1 {

	public static void main(String[] args) {
		// 1st Pattern program
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");//if we enter i value then its repeat
			}
			System.out.println();
		}
		
		System.out.println("*********2nd**********");
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");//if we enter j value then its inc/dec as condition
			}
			System.out.println();
		}
		System.out.println("********3rd***********");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("********4th***********");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j<=i;j++)
			{
				System.out.print("");
			}
		}
		
	}
	
	

}

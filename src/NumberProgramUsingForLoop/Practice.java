package NumberProgramUsingForLoop;

public class Practice {
	
	//Number divided by 3/5/7 from 1 to 100

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 || i%5==0 || i%7==0)
			{
				System.out.print(i+" ");
			}
			//System.out.println();
		}
		
		//Number divided by 5 from 1 to 100
		
		/*for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+"");
			}
			System.out.println();
		}*/

	}
	

}

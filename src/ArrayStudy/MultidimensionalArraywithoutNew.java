package ArrayStudy;

public class MultidimensionalArraywithoutNew {

	public static void main(String[] args) {
		char Grade[][]= {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
		
		for(int i=0;i<=2;i++)//for row
		{
			for(int j=0;j<=3;j++)//for coloumn
			{
				System.out.print(Grade[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		int Rollnumber[][]= {{1,2,3},{1,2,3},{1,2,3}};
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(Rollnumber[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		int number[][]= {{1,2,3,4},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(number[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}

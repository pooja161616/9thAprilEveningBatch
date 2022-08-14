package ArrayStudy;

public class MultidimensionalArray {

	public static void main(String[] args) {
		//1.Array Declaration
		int a[][]=new int[2][2];// datatype objectname=new array of datatype
		
		//2.Array initialization
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		//3.Uasage
		
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]);
		System.out.println("=======================");
		
		for(int i=0;i<=1;i++)//this for loop for row(=2)outer for loop i=0,1,2
		{
			for(int j=0;j<=1;j++)//this is for coloumn-->Inner for loop j=0,1,2
			{
				System.out.print(a[i][j]+" ");//a[0][0],a[0][1],a[1][0],a[1][1]
			}
			System.out.println();
			
		}
		System.out.println("=======================");
		
		
		
	}

}

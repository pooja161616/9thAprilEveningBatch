package ArrayStudy;

public class ArrayEg2 {

	public static void main(String[] args) {
		/*
		 * 1.String declaration and Initialization seperatly. 1st declare array capacity
		 * then Initialize array
		 */

		String Name[] = new String[6];
		Name[0] = "Pooja";
		Name[1] = "Kaju";
		Name[2] = "Sneha";
		Name[3] = "sara";
		Name[4] = "Rani";
		Name[5] = "XYZ";

		// If want multiple index result(But it takes more time)
		System.out.println(Name[0]);
		System.out.println(Name[1]);
		System.out.println(Name[2]);
		System.out.println(Name[3]);
		System.out.println(Name[4]);
		System.out.println("==================================");

		// Using for loop in increasing order(Static coding)

		for (int i = 0; i <= 4; i++) {
			System.out.println(Name[i]);
		}
		System.out.println("==================================");
		// By using dyanamic coding
		for (int i = 0; i <= Name.length - 1; i++) {
			System.out.println(Name[i]);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++");
		// Using for loop in decreasing order

		for (int i = 4; i >= 0; i--) {
			System.out.println(Name[i]);
		}
		System.out.println("==================================");

		// Declaration+Initialization in single line

		int Rollnum[] = { 1, 2, 3, 4, 5 };
		//char Grade[] = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(Rollnum[3]);// Display index value
		System.out.println("==================================");
		// Increasing order
		for (int i = 0; i <= Rollnum.length - 1; i++)// Any time we will change array capacity but it will change its
														// behavour
		{
			System.out.println(Rollnum[i]);
		}
		System.out.println("==================================");
		// Decreasing order
		for (int i = Rollnum.length - 1; i >= 0; i--) {
			System.out.println(Rollnum[i]);
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		//*********Practice examples*********************//
		//increasing order string
		
		String name1[]=new String[4];
		name1[0]="Poo";
		name1[1]="jaa";
		name1[2]="Puja";
		name1[3]="Pooja";
		for(int i=0;i<=1;i++)
		{
			System.out.println(name1[i]);
		}
		System.out.println();
		
		//reverse order
		
		for(int i=name1.length-1;i>=0;i--)
		{
			System.out.println(name1[i]);
		}
		 
		System.out.println();
		
		for(int i=0;i<=name1.length-1;i++)
		{
			System.out.println(name1[i]);
		}
		
		String name[]=new String[2];
		name[0]="Pooja";
		name[1]="Japoo";
		
		String name2[]= {"xyz","abc","pqr","mnp"};
		
		for(int i=0;i<=name2.length-1;i++)
		{
			System.out.println(name2[i]);
		}
		
		
		
		
	}
	
	

}

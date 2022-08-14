package controlStudy;

public class ElseIfStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if i got >=90 i am in dist.
		//else if i got >=66 and <90 i am in 1st class
		//else if i got >=50 and <66 i am in 2nd class
		//else if i got >=40 and <50 i am in pass class
		//else i am fail
		
		int Marks=20;
		
		if(Marks>=90)
		{
			System.out.println("i am in dist.");
		}
		else if(Marks>=66 & Marks<90)
		{
			System.out.println("i am in 1st class");
		}
		
		else if(Marks>=50 & Marks<66)
		{
			System.out.println("i am in 2nd class");
		}
		else if(Marks>=66 & Marks<90)
		{
			System.out.println("i am in 1st class");
		}
		else if(Marks>=40 & Marks<50)
		{
			System.out.println("i am in Pass class");
		}
		else
		{
			System.out.println("i am Fail");
		}
	}
	

}

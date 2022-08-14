package controlStudy;

public class NestedIfElse {

	public static void main(String[] args) {
		
		String UN="Velocity";
		String PWD="Vel123";
		if(UN=="Velocity")
		{
			System.out.println("Correct user name pl enter pwd");
		
			if(PWD=="Vel13")
			{
			System.out.println("Login successful");
			}
			else
			{
			System.out.println("Incorrect PWD,Unable to login");
			}
	
		}	
		else
		{
			System.out.println("Incorrect usename,Unable to Login");
		}
	

}
}
package Methods;

public class StaticwithParameter {

	public static void main(String[] args) {
		
		studentinfo();
		studentinfo("Pooja", 27.6f, 'F', 49f, 17);
		
		

	}
    public static void studentinfo()//Static method with zero parameter

    {
    	String name="Pooja";
    	float age=26f;
    	char gender='F';
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My gender is "+gender);
    }

    
    public static void studentinfo(String name,float age,char Gender,float weight,int rollnumber)//Static method with parameter
    
    {
    	System.out.println("==================================");
    	System.out.println("My name is "+name);
    	System.out.println("My age is "+age);
    	System.out.println("My gender is "+Gender);
    	System.out.println("My weight is "+weight);
    	System.out.println("My rollnumber is "+rollnumber);
    	System.out.println("==================================");
    	
    }
}

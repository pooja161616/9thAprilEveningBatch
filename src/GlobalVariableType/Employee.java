package GlobalVariableType;

public class Employee {
	//name, empid-->12345, sal, desg,age, gender
	//Variable declaration Globally
	
	String emp_name;
	String emp_id;
	int Sal;
	String Desg;
	int emp_age;
	char gender;
	public void emp_info()
	{
		//Usage of variable
		
		System.out.println("====================================");
		System.out.println("Employee name is "+emp_name);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee salary is "+Sal);
		System.out.println("Employee Desg is "+Desg);
		System.out.println("Employee age is "+emp_age);
		System.out.println("Employee Gender is "+gender);
	}
	

}

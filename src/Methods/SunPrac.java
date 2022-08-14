package Methods;

public class SunPrac {

	public static void main(String[] args) {
		StudentInfo();
		Data("Pooja", 22, 'F');

	}

	public static void StudentInfo() {
		String Name = "Pooja";
		Float Age = 26.5f;
		char Gender = 'F';
		System.out.println("My Name is " + Name);
		System.out.println("My age is " + Age);
		System.out.println("My Gender is " + Gender);
	}
		
	public static void Data(String name,int age,char Gender)
	{
		System.out.println("==============================");
		System.out.println("My Name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My Gender is " + Gender);
	}
	

	

}

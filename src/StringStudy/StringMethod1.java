package StringStudy;

public class StringMethod1 {

	public static void main(String[] args) {
		
		String x1="Pooja";
		String x2="Pooja";
		String x="Devadiga";
		String x3=new String("Pooja");
		String x4=new String("Devadiga");
		
		//To use length()
		
		System.out.println(x1.length());
		System.out.println(x2.length());
		System.out.println("==========================");
		
		//To use toUppercase()
		
		System.out.println(x1.toUpperCase());
		System.out.println("=========================");
		
		//To use toLowercase()
		
		System.out.println(x2.toLowerCase());
		System.out.println("=========================");
		
		//To use ==
		
		System.out.println(x1==x);
		System.out.println(x1==x2);
		System.out.println(x1==x3);
		System.out.println("=============================");
		
		//To use equals
		
		System.out.println(x1.equals(x2));
		System.out.println(x3.equals(x4));
		
	}

}

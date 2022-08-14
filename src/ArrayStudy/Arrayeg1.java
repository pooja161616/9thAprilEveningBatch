package ArrayStudy;

public class Arrayeg1 {

	public static void main(String[] args) {
		// i want to store city names

		// 1.Array declaration

		String city[] = new String[5];// datatype objectname=new array of datatype
		// 2.array initialization

		city[0] = "Sangli";
		city[1] = "Pune";
		city[2] = "Miraj";
		city[3] = null;
		city[4] = "Goa";

		// 3.ussage of array

		System.out.println(city[2]);
		// System.out.println(city[5]);//Exception error :ArrayIndexOutOfBoundException

		// 2.Int data type

		int count[] = new int[3];
		count[0] = 10;
		count[1] = 20;
		count[2] = 30;
		System.out.println(count[1]);

		// 3.Float data type

		float weight[] = new float[3];
		weight[0] = 20.30f;
		weight[1] = 40f;
		weight[2] = 30.50f;
		System.out.println(weight[2]);

		// 4.char datatype

		char gender[] = new char[2];
		gender[0] = 'F';
		gender[1] = 'M';
		// gender[2]='3';
		System.out.println(gender[1]);
		


	}

}

package Logic_Programs;

import java.util.Scanner;

public class MultipicationWithoutMulOperator {

	public static void main(String[] args) {

		// 2+2+2=6 or 3+3=6 --->2*3=6

		int sum = 0;
		int num1 = 2;
		int num2 = 3;//after how many add of 2 6 will come=3

		for (int i = 1; i <= num2; i++) {

			sum = sum + num1; // i=1 sum=0 and num1=2-->2 i=1,2,3
			// i->1-->sum=2=0+2
			// i->2-->sum=4=2+2
			// i->3-->sum=6=4+2

		}
		System.out.println("Multification is "+sum);

	}

}

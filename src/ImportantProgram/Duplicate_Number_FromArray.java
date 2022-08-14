package ImportantProgram;

public class Duplicate_Number_FromArray {

	public static void main(String[] args) {
		
		//Take first element match with remaining,and  match element will print
		
		 int a[] = { 82, 89, 80, 80, 7, 9, 20 };
		 
		 int size;
		 size=a.length;
		 
		 for(int i=0;i<size;i++) { //value of i<size = 7
			 
			 for(int j=i+1;i<size;i++) {  //for column
				 
				 if(a[i]==a[j]) {  
					 
					 System.out.println("Duplicate number is "+a[j]);
					 
				 }
				
			 }
			 
		 }
	}

}

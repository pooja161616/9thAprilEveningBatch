package ImportantProgram;

public class NumberOf_OccurancesOf_char {

	public static void main(String[] args) {
		//How many times i repeats

		String s="This is india";
		//Find total length of string
		int totalLengthOfString = s.length();
		//Find i replace with space
		
		int TotalCount_afterremove = s.replace("i","").length();
		
		int count = totalLengthOfString-TotalCount_afterremove;
		System.out.println("Number of occurance of i is "+count);
		
		

	}

}

package ImportantProgram;

public class CharcterCount_fromString_withoutSpace {

	public static void main(String[] args) {
		
		String s="Pooja Narayan Devadiga";
		int count =0;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Character count without spaces are "+count);

	}

}

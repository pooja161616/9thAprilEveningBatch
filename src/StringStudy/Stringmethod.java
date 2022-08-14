package StringStudy;

public class Stringmethod {

	public static void main(String[] args) {

		// To use length() method

		/*
		 * To calculate string length : max index+1(index start from zero) max index
		 * :string length-1
		 */

		String s1 = "Pooja";
		String s2 = "Devadiga";
		System.out.println(s1.length()); // it is one time use,not stored.
		System.out.println("=========Length======================================");

		int b = s1.length();
		/* to multiple used create reference variable i.e.object(b) */
		System.out.println(b);
		/*
		 * =s2.length();then create reference variable q=s2.length(); we get error below
		 * ref.var i.e create local variable q
		 */

		int q = s2.length();
		System.out.println(q);

		// To use null

		/*
		 * String s3=null; System.out.println(s3.length());
		 */

		// Exception run time error display on console.i.e.NullPointerException error
		System.out.println("==============Upper_Case & Lower_Case================");

		// To use touppercase()

		String s4 = "Pooja";
		System.out.println(s4.toUpperCase());

		// To use Lowercase

		String s5 = "Pooja";
		System.out.println(s5.toLowerCase());
		System.out.println("=============(== method)=============================");

		// To equals() and ==

		String s6 = "Pooja";// obj.creation takes place inside constant pool area
		String s7 = "Pooja";
		String s8 = new String("Pooja");// obj.creation takes place inside non constant pool area
		String s9 = new String("POOJA");

		// To used == operator means it compare memory location not contain(with and
		// without new keyword)

		System.out.println(s6 == s7);
		System.out.println(s7 == s8);
		System.out.println(s8 == s9);// both are non constant pool area(new) then seperate memory location is there.
		System.out.println("==============equals()===============================");

		// To used equals()

		System.out.println(s6.equals(s7));// it compare contain.it check case sensitiveness
		System.out.println(s8.equals(s9));
		System.out.println("==========equalsIgnoreCase()=========================");

		// equalsIgnoreCase : It ignore case sensitiveness
		String s10 = "Sulochana";
		String s11 = "SULOCHANa";
		System.out.println(s10.equalsIgnoreCase(s11));

		boolean m = s10.equalsIgnoreCase(s11);
		System.out.println(m);
		System.out.println("==============Contains()=============================");

		/*
		 * contains :To check contains of string & whether it is in sequence then it
		 * returns true else false.it always check case sensitive until we declare as
		 * equalsIgnorecase()
		 */
		System.out.println(s10.contains("Sulo"));
		System.out.println(s10.contains("sul"));// Case sensitive check so o/p-false
		System.out.println(s11.contains("CHANa"));
		System.out.println("=========isEmpty()===================================");

		// isEmpty() :To check string is empty or not it check (length=0)
		String e0 = "";
		String e1 = "";
		String e2 = " ";// space is there.o/p-false
		String e3 = null;
		System.out.println(e0.isEmpty());
		System.out.println(e1.isEmpty());
		System.out.println(e2.isEmpty());
		// System.out.println(e3.isEmpty());//NullPointerException(Exception error)

		boolean output = e1.isEmpty();//stored in reference variable
		System.out.println(output);
		System.out.println("==========isBlank()==================================");

		/*
		 * isBlank() : to check empty/blank space(no limitation for white space). and no
		 * contains written o/p = zero
		 */

		boolean result = e0.isBlank();
		System.out.println(result);
		System.out.println(e2.isBlank());
		System.out.println("===============charAt()==============================");

		/*
		 * charAt() : Returns the char value at the specified index. An index ranges
		 * from 0(starting point) to length()
		 */
		String w1 = "Devadiga";
		System.out.println(w1.charAt(4));
		char ans = w1.charAt(5);
		System.out.println(ans);
		System.out.println("============endswith()===============================");

		// endswith() :To check sequence of ends of string.it checks sequence of containts

		String w2 = "Narayan";
		System.out.println(w2.endsWith("yan"));
		System.out.println(w2.endsWith("ryan"));// sequence not followed
		System.out.println("===============startswith()==========================");

		// startWith() - To check starting sequence of string

		System.out.println(w2.startsWith("Nara"));
		System.out.println(w2.startsWith("rayan"));
		System.out.println("=================start_with_middle===================");
		// if we want to start middle just mention index no.
		System.out.println(w2.startsWith("rayan", 2));
		System.out.println("==========substring()================================");

		/*
		 * substring()-To seperate out small portion of string jst pass index value from
		 * where to start it consider till end no break point until we give endindex it
		 * consider endindex-1
		 */
		System.out.println(w2.substring(3));
		String result1 = w2.substring(2);
		System.out.println(result1);
		System.out.println(w2.substring(2, 6));
		/*
		 * if we want middle portion of string, raya(2(r),5(a)but give index value+1. it
		 * consider -1)
		 */
		
		System.out.println("=================Concat()============================");

		// concat method use : which merge two string

		String v1 = "Iam leaving";
		String v2 = " in pune which is in maharastra";
		System.out.println(v1.concat(v2));
		System.out.println(v1.concat(" in Sangli"));
		System.out.println("++++++++++++++++++indexof()++++++++++++++++++++++++++");

		// indexof method use :to find index of string

		String s = "Sangli";
		int index = s.indexOf('n');
		System.out.println(index);
		String z="Mumbai is capital of Maharastra";
		System.out.println(z.lastIndexOf('r'));
		System.out.println(z.indexOf('o',16));//Give index value of nearest position of string
		System.out.println("+++++++++++++++replace()+++++++++++++++++++++++++++++");
		
		//replace method use :To used replace char and remove string
		
		String z1="MumbaiPune";
		System.out.println(z1.replace('P','J'));
		System.out.println(z1.replace("Pune",""));
		

	}

}

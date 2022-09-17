package strings;

public class TestStrings {

	public static void main(String[] args) {

//		String s1 = "abc";
//		String s2 = new String("xyz");

		// Empty String

//		String s3 = "";
//		String s4 = new String();
//		String s5 = new String("");

		// null string is not same as empty string

//		String s6 = null;

		// String immutability

//		String s = "abc";
//		s = s.concat("xyz");
//		System.out.println(s);

		// String functions

		String s = "Abc";
		System.out.println("String length: " + s.length());
		System.out.println("Lowercase: " + s.toLowerCase());
		System.out.println("Uppercase: " + s.toUpperCase());

		String a = "abc";
		String b = "Abc";

		System.out.println("Equals: " + a.equals(b));
		System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(b));

		String fullName = "Jaydeep Apte";
		System.out.println("First Name: " + fullName.substring(0, 7));
		System.out.println("First Name: " + fullName.substring(8));
		
		// String Buffer

		StringBuffer sb = new StringBuffer("String Buffer !");
		System.out.println(sb.reverse());
	}
}

package part_5.com.java.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s = "welcome";
		String s1 = "to java";
		
		//length in strings
		System.out.println(s.length());  // length of the string
		
		//concat in strings
		System.out.println(s.concat(" "+s1));  // joins the strings
		
		//trim in strings
		s="    welcome   ";
		System.out.println("before trimming "+s);
		System.out.println("after trimming "+s.trim());    /// removes the space at the left and right position 
		
		
		
		
	}
}

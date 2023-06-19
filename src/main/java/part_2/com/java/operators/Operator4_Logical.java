package part_2.com.java.operators;

public class Operator4_Logical {
	// Logical operators     &&   ||   ! 
	// Logical operators are going to use when we want to check more expressions or relations
	// Logical works between two boolean values
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		
		//AND operator
		System.out.println(a<c&&b<a);   //true && true = true
		System.out.println(a>b&&a>c);   //false && true = false  
		System.out.println(a<b&&c<a);   //false && false = false
		System.out.println("test ---->> "+!(a<b));   //
		
		//OR operator
		System.out.println(a>b||a<c); //true || true = true
		System.out.println(a>b||c>a); //true || true = true
		System.out.println(a>c||b>c); //false || false = false
		System.out.println(a>b||b>c); //true || false = true
		
		// NOT operator
		System.out.println("test ---->> "+!(a<b));   //
		
		
	}
}

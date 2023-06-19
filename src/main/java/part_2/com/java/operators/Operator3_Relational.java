package part_2.com.java.operators;

public class Operator3_Relational {

	public static void main(String[] args) {
		// Relational Operators are used to compare the values.
		// Relational Operators (Comparision Operator) ------->>>  == ,  < , > , <= ,  >= ,  !=
		// Always return boolean values
		int a=10;
		int b=20;
		System.out.println(a==b);   /// false
		System.out.println(a<b);     /// true
		System.out.println(a>b);     /// false
		System.out.println("test ------>>> "+ (a<=b));  // Either one of the condition should be true.
		System.out.println(a>=b);
		System.out.println(a!=b);
	}
}

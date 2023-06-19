package part_10.com.java.statickeyword;

public class StaticRestrictions {
	/**
	 * Restrictions for static method
	 * ------------------------------
	There are two main restrictions for the static method. They are:
	1. Static method can not use non static data member or call non-static method directly.
	*/
	
	int a=50;   //non static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a);
	}
}

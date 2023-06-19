package part_10.com.java.statickeyword;

public class StaticBlock {
	
	/**
	 *  Java static block

	Is used to initialize the static data member.
	It is executed before main method at the time of classloading.
	 */
	static{
		System.out.println("static block is invoked");
	}  
	
	public static void main(String args[]){  
	   System.out.println("Hello main");  
	}  
}

package part23_com.java.exceptionhandling;

public class ArithmeticException3 {

	public static void main(String[] args) {
		try {
			int a=50/0;
			System.out.println("test test");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("finally block is always executed");
		}  
	}
}

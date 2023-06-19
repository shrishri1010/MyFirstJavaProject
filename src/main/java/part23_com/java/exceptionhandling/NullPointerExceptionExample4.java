package part23_com.java.exceptionhandling;

public class NullPointerExceptionExample4 {
	
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

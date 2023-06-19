package part23_com.java.exceptionhandling;

public class NumberFormatExcExample5 {
	
	public static void main(String[] args) {
		try {
			String s="helloworld";
			int i=Integer.parseInt(s);     //NumberFormatException  
			System.out.println("i is ---" + i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

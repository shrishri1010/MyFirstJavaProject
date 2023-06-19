package part_10.com.java.statickeyword;

public class Calculate {
	
	static int calculate(int x){
		return x*x*x;
	}
	
	public static void main(String[] args) {
		int a = Calculate.calculate(5);
		System.out.println("result is "+a);
	}
	
}

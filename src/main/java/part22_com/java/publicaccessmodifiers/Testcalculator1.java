package part22_com.java.publicaccessmodifiers;

public class Testcalculator1 {

	public static void main(String[] args) {
		Testcalculator test = new Testcalculator();
		int a =test.num;
		System.out.println(a);
		test.sum();
	}
	}

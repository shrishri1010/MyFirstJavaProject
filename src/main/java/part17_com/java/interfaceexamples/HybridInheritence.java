package part17_com.java.interfaceexamples;

class A1 {
	void test1() {
		System.out.println(" this is test1 method from A1 class ");
	}
}

interface B1 {
	int a = 100;
	void test2();
}

interface B2 {
	int b = 200;
	void test3();
}

public class HybridInheritence extends A1 implements B1, B2 {

	public void test2() {
		System.out.println(a);
		System.out.println(" this is test2 method from B1 interface ");
	}

	public void test3() {
		System.out.println(b);
		System.out.println(" this is test3 method from B2 interface ");
	}

	public static void main(String[] args) {
		HybridInheritence hy = new HybridInheritence();
		
		hy.test1();
		hy.test2();
		hy.test3();
	}

}

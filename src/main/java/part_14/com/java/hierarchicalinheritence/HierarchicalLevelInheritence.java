package part_14.com.java.hierarchicalinheritence;

	class A{
		int a=10;
		
		public void test1() {
			System.out.println("print test1");
		}
	}
	class B extends A{
		int b =20;
		public void test2() {
			System.out.println("print test2");
		}
	}
	
	class C extends A{
		int c=30;
		public void test3() {
			System.out.println("print test3");
		}
	}
	
	public class HierarchicalLevelInheritence {
		public static void main(String[] args) {
			//Object of class A
			A a = new A();
			System.out.println(a.a);
			a.test1();
			
			//Object of class B
			B b = new B();
			System.out.println(b.b);
			b.test2();
			System.out.println(b.a);
			b.test1();
			
			//Object of class C
			C c = new C();
			System.out.println(c.c);
			c.test3();
			System.out.println(c.a);
			c.test1();
			//c.b;
		}
}

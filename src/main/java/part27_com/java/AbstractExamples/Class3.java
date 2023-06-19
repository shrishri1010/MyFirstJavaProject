package part27_com.java.AbstractExamples;

abstract class Class3 {
	
	abstract void operation();
	
	void test(){
		System.out.println("test");
	}
}

class Dev1 extends Class3{

	@Override
	void operation() {
		System.out.println(3+7);
	}
}

class Dev2 extends Class3{

	@Override
	void operation() {
		System.out.println(3*6);
		
	}
	public static void main(String[] args) {
		Dev2 obj=new Dev2();
		obj.operation();
	}
	
}
	
	



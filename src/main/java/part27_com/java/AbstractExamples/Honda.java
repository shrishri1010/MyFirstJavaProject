package part27_com.java.AbstractExamples;

abstract class Bike{
	
	public void speed() {
		System.out.println("speed is above 100");
	}
	
	public void run() {
		System.out.println("running successfully");
	}
	
	public abstract void mileaqe();
	
}

class Honda extends Bike{

	@Override
	public void mileaqe() {
		System.out.println("running 50km per hour");
	}
	
	public static void main(String[] args) {
		Honda h = new Honda();
		h.mileaqe();
		h.speed();
		h.run();
	}
}

























/*abstract class Bike {
	
	 void speed(){
		 System.out.println("speed");
	 }
	 
	abstract void run();
}
 
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("running...");
	}
	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();
		h.speed();
	}
	
}*/

 
 



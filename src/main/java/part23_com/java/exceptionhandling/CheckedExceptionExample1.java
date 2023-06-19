package part23_com.java.exceptionhandling;

public class CheckedExceptionExample1 {
	
	//Example fro Checked Exception - InterruptedException
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is started");
		System.out.println("program is in progress");
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		Thread.sleep(5000);  //InterruptedException
		System.out.println("program is completed");
		System.out.println("program is exited");
	}
}

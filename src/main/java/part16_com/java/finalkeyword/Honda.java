package part16_com.java.finalkeyword;
//If you make any method as final, you cannot override it.

class Biketest{
	final void run(){
		System.out.println("running....");
	}
}

public class Honda extends Biketest {
	 
	void run(){    //throws compile time error
		System.out.println("running speed is more than 120");
	}
     
	 public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	 }  
}

package part16_com.java.finalkeyword;
//If you declare variable as final, you cannot change the value of it.
public class BikeTest {
	final int speedlimit=90;
	
	public void run() {
		//speedlimit=120;   //you cannot change the value of the final variable
		System.out.println("speed limit is --" + speedlimit);
	}
	
	public static void main(String[] args) {
		BikeTest b = new BikeTest();
		b.run();
	}
}






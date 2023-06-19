package part16_com.java.finalkeyword;
//If you make any class as final, you cannot extend it.
final class Bike{
	//this class declared long time back
}  

public class Honda1 extends Bike{

	public static void main(String[] args) {
		Honda1 honda= new Honda1();  
		honda.run();  
	}

}

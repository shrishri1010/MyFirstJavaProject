package part_3.com.java.controlstatements;

public class Example6_Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;  
	    switch(number){  
		    case 100: System.out.println("10");
		    default:System.out.println("Not in 10, 20 or 30"); 
		    break;
		    case 10: System.out.println("20");  
		    case 30: System.out.println("30");  
	    }  
	}
}

package part_3.com.java.controlstatements;

public class Example2_IFElseIF {
	
	/*
	 * Nested if .... else  --- 
	 * when to use Nested if .... else -  when  the condition is 2 to 5 conditions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int marks=60;  
	      
	    if(marks<50){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){ 
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }else if(marks==65 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!");  
	    }  
	}
}

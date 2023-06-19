package part_3.com.java.controlstatements;

public class Example3_IfElse {
	/*
	 * Nested if .... else
	 */
	public static void main(String args []){
		int i = 30;
		int j = 50;
		int k = 35;
		
		//Simple If Statement
		System.out.println("If statement");
		if (i<j) {
			System.out.println("Value of i("+i+") is smaller than Value of j("+j+")");
		}
		
		//If Else Statement
		System.out.println("***If Else Statement Example***");
		if (i >= j) {
			System.out.println("Value of i("+i+") is greater than value of j("+j+") ");
		} else {
			System.out.println("Value Of i("+i+") Is Smaller Than Value Of j("+j+")" );
		}
		
		//Nested If else Statement
		System.out.println("***Nested If Else Statement Part***");
		//Bellow given message will be printed if value of variable k is 
		//less than value of variable i.
		if (k<i)
		  {
		   System.out.println("Value Of k("+k+") Is Less Than Value Of i("+i+")" );
		  }
		
		else if (k>=i && k<=j){//Bellow given message will be printed if value of 
			//variable k is greater than or equals to value of variable i 
			//and less than or equals to value of variable j.
		   System.out.println("Value Of k("+k+") Is In Between Value Of i("+i+") "
		   		+ "And Value Of Value Of j("+j+")" );
		}
		
		else //Bellow given message will be printed if value of variable k 
			//is greater than value of variable j.
		{
		   System.out.println("Value Of k("+k+") Is Greater Than Value Of j("+j+")" );
		}
}
}

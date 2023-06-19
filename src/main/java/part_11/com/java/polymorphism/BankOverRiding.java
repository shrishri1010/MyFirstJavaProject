package part_11.com.java.polymorphism;

class Bank{  
	int getRateOfInterest(){
		return 0;
	}  
}	
	
class SBI extends Bank{
	int getRateOfInterest(){
		return 8;
	} 
}
  
class ICICI extends Bank{  
	int getRateOfInterest(){
		return 7;
	}  
}  

class AXIS extends Bank{  
	int getRateOfInterest(){
		return 9;
	}  
} 

public class BankOverRiding {
	public static void main(String[] args) {
		SBI s=new SBI();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		
		ICICI i=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		
		AXIS a=new AXIS();
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}
}

package part27_com.java.AbstractExamples;

abstract class BankAbstractClass {
	public int vehicleLoanInterest() {
		return 12;
	}
	abstract int housingLoanInterest();
}

class SBI extends BankAbstractClass{

	@Override
	int housingLoanInterest() {
		return 7;
	}
}
class PNB extends BankAbstractClass{

	@Override
	int housingLoanInterest() {
		return 9;
	}
}


public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();  
		System.out.println("Rate of Interest is: "+s.housingLoanInterest()+" %");    
		PNB p=new PNB();  
		System.out.println("Rate of Interest is: "+p.housingLoanInterest()+" %");    
	}
}



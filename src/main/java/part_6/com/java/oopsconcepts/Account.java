package part_6.com.java.oopsconcepts;

public class Account {
	int acc_no;  
	String name;  
	float amount;
	
	void insert(int a,String n, float amt){
		acc_no=a;
		name=n;
		amount=amt;
	}
	
	void display(){
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	void deposit(float amt){
		amount=amount+amt;
		System.out.println("before deposit" + amt);
		System.out.println("after deposit" + amount);
	}
	
	void checkBalance(){
		System.out.println("check balance is " + amount);
	}
	
	void withDraw(float amt){
		if (amount<amt) {
			System.out.println("no balance");
		}else {
			amount=amount-amt;
			System.out.println("amount is "+amount);
		}
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		a.insert(101012, "maxim", 1000.00f);
		a.display();
		a.deposit(40000.00f);
		a.checkBalance();
		a.withDraw(15000.00f);
		a.checkBalance();
	}
	
}

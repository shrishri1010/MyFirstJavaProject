package part_2.com.java.operators;

public class Operator5_IncrementDecrement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30 ,d=30 ,f=30;
		
		
		a++;   //a=a+1;
		System.out.println(a);
		
		a+=5; //Means a=a+5;
		
		b+=15; // b=b+15;
		
		c-=10; //c=c-10;
		d*=10; //d=d*10;
		f/=10; //f=f/10;
		
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		System.out.println("Value of c is " + c);
		System.out.println("Value of d is " + d);
		System.out.println("Value of f is " + f);
	}
}

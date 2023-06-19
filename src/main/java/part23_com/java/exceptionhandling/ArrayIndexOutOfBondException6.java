package part23_com.java.exceptionhandling;



public class ArrayIndexOutOfBondException6 {
	/*String a[]=new String[5];
	a[0]="shri"; 
	a[1]="mathew";
	a[2]="mathew";
	a[3]="mathew";
	a[4]="mathew";
	a[5]="mathew";
	
	System.out.println("array is -->>"+a[0]);
	System.out.println("array is -->>"+a[1]);
	System.out.println("array is -->>"+a[2]);
	System.out.println("array is -->>"+a[3]);
	System.out.println("array is -->>"+a[4]);
	System.out.println("array is -->>"+a[5]);*/
	
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5]=50;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

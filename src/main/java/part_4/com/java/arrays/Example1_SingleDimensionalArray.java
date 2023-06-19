package part_4.com.java.arrays;

public class Example1_SingleDimensionalArray {

	public static void main(String[] args) {
		
		//Approach 1
		int a[]=new int[5];    //Declared array with size 5, starting index is 0 , last index is 4
		
		//Storing/inserting values into array
		a[0]=25;
		a[1]=30;
		a[2]=10;
		a[3]=20;
		a[4]=50;
		//a[5]=89;
		System.out.println(a[4]);
		
		//Approach 2
		int b[]= {10,20,30,50,60};    //Declared an array without specifying the size
		
		//size of the array ---- length of the array. Here, length is a variable not a method.
		int size=b.length;
		System.out.println(size);  //prints size of the array or length of the array
		
		//Read the values from for loop
		for (int i = 0; i<=b.length-1; i++) {
			System.out.println(b[i]);
		}
		
		//Read the values from using enhanced for loop
		for (int i : b) {
			System.out.println(i);
		}
		
	}
}

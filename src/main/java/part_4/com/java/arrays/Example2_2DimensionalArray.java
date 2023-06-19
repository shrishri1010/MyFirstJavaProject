package part_4.com.java.arrays;

public class Example2_2DimensionalArray {

	public static void main(String[] args) {
		
		//Approach 1
		int a[][]=new int[3][2];    //Declared 3 rows and 2 columns
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 60;
		
		//Find the Number of rows
		System.out.println("Number of rows ----->>"+ a.length);
		
		//Find the Number of coloumns
		System.out.println("Number of columns ----->>"+ a[0].length);
		
		for (int i = 0; i< a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				System.out.println("print  ----->>"+ a[i][j]);
			}
		}
		
		System.out.println("***********************************");
		// Enhanced for loop ----  For-Each loop
		// m contains first row 100 -200, 300-400 and goes on iterate.
		for (int[] m : a) {  // 100-200,  300-400, 500-60
			for (int i : m) {
				System.out.println("print  ----->>"+ i);
			}
		}
		
		//Approach 2
		int b[][] = {{10,20},{30,40},{50,80}};
	}
}

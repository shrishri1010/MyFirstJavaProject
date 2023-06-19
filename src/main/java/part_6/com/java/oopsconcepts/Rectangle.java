package part_6.com.java.oopsconcepts;

public class Rectangle {
	 int length;  
	 int width;
	 
	 public void insert(int l, int w) {
		length=l;
		width=w;
	 }
	 
	 public void calculateArea() {
		int area = length*width;
		System.out.println("Area of the rectangle is "+area);
	 }
	 
	 
	 public static void main(String args[]) {
		 Rectangle r = new Rectangle();
		 r.insert(25, 30);
		 r.calculateArea();
	 }
}

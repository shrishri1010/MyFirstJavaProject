package part24_com.java.collections;

import java.util.ArrayList;

public class ArrayListCollection2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(454);
		al.add("ramesh");
		al.add("suresh");
		al.add("joel");
		al.add("maxim");
		al.add('A');
		System.out.println("print size " + al.size());
		System.out.println("print elements in list " + al);
		
		//Object type variable "obj" can hold any type of values.
		for (Object obj : al) {
			System.out.println("Iterate the values in loop ----->>> "+obj);
		}
		
	}
}
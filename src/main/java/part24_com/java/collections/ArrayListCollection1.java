package part24_com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection1 {

	public static void main(String[] args) {
		// How to declare array list
		
		// ArrayList  list = new ArrayList();    //We can store any type of elements
		// ArrayList<Integer> list = new ArrayList<Integer>();  //We can store only Integer values
		
		ArrayList<String> al = new ArrayList<String>();  //We can store only String values
		//Adding values to arraylist
		al.add("suresh");
		al.add("ramesh");
		al.add("mahesh");
		al.add("maxim");
		al.add("gururaj");
		al.add(null);
		
		//Size of the arraylist
		int arraylistSize=al.size();
		System.out.println("arraylistSize is "+arraylistSize);   //size is 6
		System.out.println("Before removing the element "+al);
		
		//Remove the element from arraylist
		al.remove(3);
		
		//Find the size after removing the element
		System.out.println("After removing the element - size is "+al.size());   //size is 5
		System.out.println("After removing the element "+al);
		
		//Inserting a new element into arraylist
		al.add(1,"veerusahasrabuddi");
		System.out.println("After adding the new element - size is "+al.size());   //size is = 6
		System.out.println("After adding the new  element "+al);
		al.add("Gary Jim");
		
		//Read the values from array list using enhanced for loop
		for (String str : al) {
			System.out.println("looping the list ---->> "+str);
		}
		
		
		
		//There are two ways to traverse collection elements:
		//1.By Iterator interface.
		//2.By for-each loop.
		
		/*
		 * Iterator itr = al.iterator(); System.out.println("value is " +
		 * itr.hasNext()); while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
		
		/*while (itr.hasNext()) {
			Object object = (Object) itr.next();
			System.out.println("value are -->>"+object);
			
		}*/
}}

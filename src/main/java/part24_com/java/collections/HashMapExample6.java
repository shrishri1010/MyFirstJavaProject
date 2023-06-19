package part24_com.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class HashMapExample6 {

	public static void main(String[] args) {
		
		//Declaration of HashMap -- HashMap hm = new HashMap();
		//HashMap is the Key-Value pair.
		HashMap<Integer,String> hm = new HashMap<Integer,String>();  // Integer is the Key, String is the Value
		
		//Adding the Key-Value pairs in Hash map
		hm.put(101,"ramesh");
		hm.put(102,"suresh");
		hm.put(103,"mukesh");
		hm.put(104,"ambani");
		System.out.println(hm);
		/*
		 * Remove a pair from Hashmap
		 */
		hm.remove(103);
		System.out.println("After removing a pair :"+hm);
		
		//Reading pairs using for loop
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());;
		}
		
		/*
		 * for (String str : hs) { System.out.println("print elements -->>"+str); }
		 */
		
		
		
	}
}

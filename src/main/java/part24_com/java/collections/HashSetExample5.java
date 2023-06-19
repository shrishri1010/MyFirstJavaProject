package part24_com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample5 {

	public static void main(String[] args) {
		
		//Declaration of HashSet
		HashSet<String> hs = new HashSet<String>();
		hs.add("ramesh");
		hs.add("suresh");
		hs.add("sathish");
		hs.add("joel");
		hs.add("joel");
		
		System.out.println(hs.size());
		
		for (String str : hs) {
			System.out.println("print elements -->>"+str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("ramesh");
		ls.add("suresh");
		ls.add("joel");
		ls.add("joel");
		
		for (String str : ls) {
			System.out.println("print--->>"+str);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}

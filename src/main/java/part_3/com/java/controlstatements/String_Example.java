package part_3.com.java.controlstatements;

public class String_Example {
	
	public static void main(String []args)  {
		String st1 = "This World is Very Nice";
		String st2 = " And Beautiful.";
		
		//concatenate two strings.
		System.out.println("concatenate two strings :"+st1.concat(st2));
		
		//Comparing two strings. Return true or false.
		System.out.println("comparing two strings :" + st1.equals(st2));
		
		//length of the string or size of the string
		System.out.println("length of the string1 is "+st1.length());
		System.out.println("length of the string2 is "+st2.length());
		
		//convert into uppercase
		System.out.println("convert into uppercase"+st1.toUpperCase());
		System.out.println("convert into uppercase"+st2.toUpperCase());
		
		//convert into lowercase
		System.out.println("convert into lowercase"+st1.toLowerCase());
		System.out.println("convert into lowercase"+st2.toLowerCase());
		
		//Retrieve the 5th Indexed character from string.
		System.out.println("character at Index 5 is " + st1.charAt(5));
		
		//Retrieve the Index of first 'i' character.
		System.out.println("Index of 1st charater i Is -->> " + st1.indexOf('i'));
				
		//Retrieve the index of 3rd most 'i' character.
		System.out.println("Index of 3rd charater i is --->> " +st1.indexOf('i',50));
				
		//Retrieve the Index of word 'Very' from string.
		System.out.println("Index of word Very Is -> " + st1.indexOf("Very"));
		
		//convert int to string 
		int i=50;
		String str=String.valueOf(i);
		System.out.println("print str is:"+str);
		
		//convert string to int
		String str1="12545";
		int a=Integer.parseInt(str1);
		System.out.println("value a is:"+a);
		
		
		
		
		
		
		
		
		
		
		/*//Concatenates st2 with st1.
		System.out.println("concate two strings --->>"+st1.concat(st2));
		
		//Comparing two strings. Return true If both match 
		//else return false.
		System.out.println("compare two strings --->> "+st1.equals(st2));
		
		//length of the string or size of the string
		System.out.println("length of string st1 is -->"+st1.length());
		System.out.println("length of string st2 is -->"+st2.length());
		
		//convert into uppercase
		System.out.println("uppercase is"+st1.toUpperCase());
		System.out.println("uppercase is"+st2.toUpperCase());
		
		//convert into lowercase
		System.out.println("lowercase is"+st1.toLowerCase());
		System.out.println("lowercase is"+st2.toLowerCase());
		
		//Retrieve the 5th Indexed character from string.
		System.out.println("character at Index 5 is " + st1.charAt(5));
		
		//Retrieve the Index of first 'i' character.
		System.out.println("Index of 1st charater i Is -->> " + st1.indexOf('i'));
		
		//Retrieve the index of 2nd most 'i' character.
		System.out.println("Index of 2nd charater i is --->> " +st1.indexOf('i',3));
		
		//Retrieve the Index of word 'Very' from string.
		System.out.println("Index of word Very Is -> " + st1.indexOf("Very"));
				
		//convert int to string
		int i=25;
		String str=String.valueOf(i);
		System.out.println("value is " + str);
		
		//convert String to int
		String st = "100";
		int j = Integer.parseInt(st);
		System.out.println("valu of j is " + j);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//Split String.
		String splt[] = st1.split("World");
		
		System.out.println("String part1 is -->>>" + splt[0]);
		System.out.println("String part1 is -->>>" + splt[1]);*/
		
		
		
		/*//Concatenates st2 with st1.
		System.out.println("concat strings --->> "+st1.concat(st2));
		
		//Comparing two strings. Return true If both match else return false.
		//st1.equals(st2)
		System.out.println("comparing values --- " + st1.equals(st2));
		System.out.println("comparing values --- " + !st1.equals(st2));
		
		//length of the string st1.length();
		System.out.println("length of the strinf st1 is " + st1.length());
		System.out.println("length of the strinf st2 is " + st2.length());
		
		//convert into uppercase
		System.out.println("to uppercase " +st1.toUpperCase());
		
		//convert into uppercase
		System.out.println("to lowercase" + st2.toLowerCase());
		
		//Retrieve the 9th Indexed character from string.
		System.out.println("character at Index 9 is " + st1.charAt(5));
		
		//Retrieve the Index of first 'i' character.
		System.out.println("Index of 1st charater i Is -->> " + st1.indexOf('i'));
		
		
		//Retrieve the index of 2nd most 'i' character.
		System.out.println("Index of 2nd charater i is --->> " +st1.indexOf('i',3));
	
		//Retrieve the Index of word 'Very' from string.
		System.out.println("Index of word Very Is -> " + st1.indexOf("Very"));
		
		//convert int to string
		int i=25;
		String str=String.valueOf(i);
		System.out.println("value is " + str);
		
		//convert string to int
		String st = "100";
		int j = Integer.parseInt(st);
		System.out.println("valu of j is " + j);
	
		//Split string.
		
		String splt[] = st1.split("Very");
		System.out.println("string part1 is -->>>" + splt[0]);
		System.out.println("string part1 is -->>>" + splt[1]);*/
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//Comparing two strings. Return true If both match else return false.
		System.out.println("st1 equals to st2 -->> " + st1.equals(st2));
		
		//Concatenates st2 with st1.
		System.out.println("st1 concatenate to st2 --- >> " +st1.concat(st2));
		
		//Retrieve the 9th Indexed character from string.
		System.out.println("character at Index 9 is " + st1.charAt(9));
		
		//Find the length of string.
		System.out.println("length of the string is" + st1.length());
		
		//Converting whole string In lower case.
		System.out.println("String in lowercase -->> " + st1.toLowerCase());
		
		//Converting whole string In upper case.
		System.out.println("String in uppercase --- >> " + st1.toUpperCase());
		
		//Retrieve the Index of first 'i' character.
		System.out.println("Index of 1st charater i Is -->> " + st1.indexOf('i'));
		
		//Retrieve the index of 2nd most 'i' character.
		System.out.println("Index of 2nd charater i is --->> " +st1.indexOf('i',3));
		
		//Retrieve the Index of word 'Very' from string.
		System.out.println("Index of word Very Is -> " + st1.indexOf("Very"));
		
		//Converting value From int to string.
		int j = 75;
		String val2 = String.valueOf(j);
		System.out.println("Value Of string val2 Is --->> " + val2);
		
		//Converting string to integer.
		String val1 = "50";
		int i= Integer.parseInt(val1);
		System.out.println("Value of int i is " + i);
		
		//Print the String starting from 5th Index to 12th Index.
		System.out.println("Retrieving sub string from string -> "+st1.substring(5,13));
		
		//Split string.
		String splt[] = st1.split("Very");
		System.out.println("String Part 1 Is ->" + splt[0]);
		System.out.println("String Part 2 Is ->" + splt[1]);*/
	//}
//}

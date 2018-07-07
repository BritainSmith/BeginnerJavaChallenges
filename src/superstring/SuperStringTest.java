package superstring;

import static common.SimpleTestLib.test;
import static common.SimpleTestLib.assertTrue;

public class SuperStringTest {
	
	public static void testCharAt(){
		test("1. get the character at a specific index in the SuperString.");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		
		assertTrue(str1.charAt(0) == 'I');
		assertTrue(str1.charAt(6) == 'd');
	}
	
	public static void testContains(){
		test("2. check whether a SuperString has another SuperString within it.");
		
		SuperString str = new SuperString("I'm a dork knight");
		
		assertTrue(str.contains("dork"));
		assertTrue(!str.contains("dark"));
	}
	
	public static void testConcat(){
		test("3. append 2 SuperString's together and return the result");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString(" lesbian");
		SuperString str3 = new SuperString("Sir, ");
		
		assertTrue(str1.concat(str2).equals("I'm a dork knight lesbian"));
		assertTrue(str3.concat(str1.concat(str2)).equals("Sir, I'm a dork knight lesbian"));
	}
	
	public static void testEquals(){
		test("4. check whether the characters in a SuperString are the same (and in the same order) as another SuperString");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString("I'm a dork knight");
		SuperString str3 = new SuperString("I'm a dark knight");
		SuperString str4 = new SuperString("I'M A DORK KNIGHT");
		
		assertTrue(str1.equals(str2));
		assertTrue(!str1.equals(str3));
		assertTrue(!str1.equals(str4));
	}
	
	public static void testEqualsIgnoreCase(){
		test("5. check whether the characters in a SuperString are the same (and in the same order) as another SuperString while ignoring uppercase and lowercase.");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString("I'm a dork knight");
		SuperString str3 = new SuperString("I'm a dark knight");
		SuperString str4 = new SuperString("I'M A DORK KNIGHT");
		
		assertTrue(str1.equals(str2));
		assertTrue(!str1.equals(str3));
		assertTrue(str1.equals(str4));
	}
	
	public static void testIndexOf(){
		test("6. find a character in a SuperString and return its location in the underlying char array. Return -1 if it doesn't exist.");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		
		assertTrue(str1.indexOf('d') == 6);
		assertTrue(str1.indexOf('b') == -1);
	}
	
	public static void testLength(){
		test("7. get the total number of characters in the underlying char array");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString("");
		
		assertTrue(str1.length() == 17);
		assertTrue(str2.length() == 0);
	}
	
	public static void testSubstring(){
		test("8. get a substring from a SuperString given a starting index (inclusive) and an end index (not inclusive)");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString actualResult = str1.substring(6,10);
		
		assertTrue(actualResult.equals("dork"));
	}
	
	public static void testToUpperCase(){
		test("9. convert a SuperString to upper case and return a new SuperString as a result. This is similar to the toLowerCase method.");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString("I'M A DORK KNIGHT");
		
		assertTrue(str1.toUpperCase().equals("I'M A DORK KNIGHT"));
		assertTrue(str2.toUpperCase().equals("I'M A DORK KNIGHT"));
	}
	
	public static void testToLowerCase(){
		test("10. convert a SuperString to lower case and return a new SuperString as a result. This is similar to the toUpperCase method.");
		
		SuperString str1 = new SuperString("I'm a dork knight");
		SuperString str2 = new SuperString("I'M A DORK KNIGHT");
		
		assertTrue(str1.toUpperCase().equals("i'm a dork knight"));
		assertTrue(str2.toUpperCase().equals("i'm a dork knight"));
	}
	
	public static void main(String[] args){
		testCharAt(); //1
		testContains(); //2
		testConcat(); //3
		testEquals(); //4
		testEqualsIgnoreCase(); //5
		testIndexOf(); //6
		testLength(); //7
		testSubstring(); //8
		testToUpperCase(); //9
		testToLowerCase(); //10
	}
}

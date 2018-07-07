package superstring;

public class SuperString {
	/*
	 * this is a private variable so it is not visible to the outside.
	 * to test this, try accessing this from the outside and see what happens:
	 * 		SuperString str1 = new SuperString("test");
	 * 		str1.str; //the compiler will throw a compilation error
	 * */
	private char[] str;
	
	/*
	 * the following two pieces of code are constructors and are used to set the str char array at the top of this class.
	 * */
	public SuperString(char[] str){
		this.str = str;
	}
	
	public SuperString(String str){
		this.str = str.toCharArray();
	}
	
	/*
	 * 1. get the character at a specific index in the SuperString.
	 * 
	 * ex:
	 * SuperString str = new SuperString("I'm a dork knight");
	 * int ix1 = str.charAt(0); //I
	 * int ix2 = str.charAt(6); //d
	 * */
	
	public char charAt(int index){
		return 'a';
	}
	
	/*
	 * 2. check whether a SuperString has another SuperString within it.
	 * 
	 * ex:
	 * SuperString str = new SuperString("I'm a dork knight");
	 * str.contains(new SuperString("dork")); //true
	 * str.contains(new SuperString("dark")); //false
	 * */
	
	public boolean contains(SuperString str2){
		return false;
	}
	
	/*
	 * 3. append 2 SuperString's together and return the result
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * SuperString str2 = new SuperString(" lesbian");
	 * SuperString str3 = new SuperString("Sir, ");
	 * SuperString newStr = str1.concat(str2); //should be: I'm a dork knight lesbian
	 * SuperString newStr2 = str3.concat(newStr); //should be: Sir, I'm a dork knight lesbian
	 * */
	
	public SuperString concat(SuperString str2){
		return new SuperString("");
	}
	
	/*
	 * 4. check whether the characters in a SuperString are the same (and in the same order) as another SuperString
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * SuperString str2 = new SuperString("I'm a dork knight");
	 * SuperString str3 = new SuperString("I'm a dark knight");
	 * SuperString str4 = new SuperString("I'M A DORK KNIGHT");
	 * 
	 * str1.equals(str2); //true
	 * str1.equals(str3); //false
	 * str1.equals(str4); //false
	 * */
	public boolean equals(SuperString str2){
		return false;
	}
	
	/*
	 * 5. check whether the characters in a SuperString are the same (and in the same order) as another SuperString while ignoring uppercase and lowercase.
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * SuperString str2 = new SuperString("I'm a dork knight");
	 * SuperString str3 = new SuperString("I'm a dark knight");
	 * SuperString str4 = new SuperString("I'M A DORK KNIGHT");
	 * 
	 * str1.equals(str2); //true
	 * str1.equals(str3); //false
	 * str1.equals(str4); //true <-- this is the main difference between this method and the above method
	 * */
	public boolean equalsIgnoreCase(SuperString str2){
		return false;
	}
	
	/*
	 * 6. find a character in a SuperString and return its location in the underlying char array. Return -1 if it doesn't exist.
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * int loc1 = str1.indexOf('d'); //stores 6
	 * int loc2 = str1.indexOf('b'); //stores -1
	 * */
	public int indexOf(char character){
		return 0;
	}
	
	/*
	 * 7. get the total number of characters in the underlying char array
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * str1.length(); //should be 17
	 * SuperString str2 = new SuperString("");
	 * str2.length(); //should be 0
	 * */
	public int length(){
		return 0;
	}
	
	/*
	 * 8. get a substring from a SuperString given a starting index (inclusive) and an end index (not inclusive)
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * str1.substring(6,10); //returns SuperString("dork");
	 * */
	public SuperString substring(int startIx, int endIx){
		return new SuperString("");
	}
	
	/*
	 * 9. convert a SuperString to upper case and return a new SuperString as a result. This is similar to the toLowerCase method.
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * str1.toUpperCase(); // returns new SuperString("I'M A DORK KNIGHT");
	 * SuperString str2 = new SuperString("I'M A DORK KNIGHT");
	 * str2.toUpperCase(); // returns new SuperString("I'M A DORK KNIGHT"); (identical to the above)
	 * */
	public SuperString toUpperCase(){
		return new SuperString("");
	}
	
	/*
	 * 10. convert a SuperString to lower case and return a new SuperString as a result. This is similar to the toUpperCase method.
	 * 
	 * ex:
	 * SuperString str1 = new SuperString("I'm a dork knight");
	 * str1.toUpperCase(); // returns new SuperString("i'm a dork knight");
	 * SuperString str2 = new SuperString("I'M A DORK KNIGHT");
	 * str2.toUpperCase(); // returns new SuperString("i'm a dork knight");
	 * */
	public SuperString toLowerCase(){
		return new SuperString("");
	}
	
	/*
	 * returns the char array at the top of the class
	 * */
	public char[] toCharArray(){
		return str;
	}
	
	public String toString(){
		return new String(str);
	}
	
	public boolean equals(String str){
		return this.toString().equals(str);
	}
	
	public boolean contains(String str){
		return contains(new SuperString(str));
	}
}
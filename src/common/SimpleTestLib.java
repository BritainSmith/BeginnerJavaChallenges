package common;

/*
 * This is a simple test library that emulates some functionality from JUnits.
 * */

public final class SimpleTestLib {
	public static void assertTrue(boolean condition, String errorMessage){
		if(!condition){
			System.out.println("***FAIL: " + errorMessage);
		}else{
			System.out.println("***PASS: -- :)");
		}
	}
	
	public static void assertTrue(boolean condition){
		assertTrue(condition, " -- :(");
	}
	
	public static void assertFalse(boolean condition){
		assertTrue(!condition);
	}
	
	public static void test(String testName){
		System.out.println("EXECUTING: " + testName);
	}
}

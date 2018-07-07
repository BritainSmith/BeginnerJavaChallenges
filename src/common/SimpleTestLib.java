package common;

public final class SimpleTestLib {
	public static void assertTrue(boolean condition, String errorMessage){
		if(!condition){
			System.out.println("***FAIL: " + errorMessage);
		}else{
			System.out.println("***SUCCESS: -- :)");
		}
	}
	
	public static void assertTrue(boolean condition){
		assertTrue(condition, " -- :(");
	}
	
	public static void test(String testName){
		System.out.println("EXECUTING: " + testName);
	}
}

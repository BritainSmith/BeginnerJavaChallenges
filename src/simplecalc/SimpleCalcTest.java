package simplecalc;
/*
 * Follow the comments in this class and the corresponding "SimpleCalc.java" class to complete this challenge.
 * */
public class SimpleCalcTest {
	
	public static void main(String[] args){
		/*
		 * 1. Replace the assignment of the following 2 variables with input passed into the program as arguments.
		 * */
		String num1 = "5"; //replace the contents that are to the right of the equal sign
		String num2 = "12"; //replace the contents that are to the right of the equal sign
		
		SimpleCalc calc = new SimpleCalc(num1,num2); //<-- this is calling a constructor to create a SimpleCalc object called calc.
		
		System.out.println("The numbers you passed in are: " + num1 + ", " + num2);
		System.out.println("The sum of the 2 numbers is: " + calc.sum());
		/*
		 * 2. Continue these print statements below by printing out the results for multiply, divide, and subtract.
		 * */
		
	}
}

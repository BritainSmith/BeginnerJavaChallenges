package simplecalc;

public class SimpleCalc {
	int num1, num2;
	
	public SimpleCalc(String n1, String n2){
		try{
			num1 = Integer.parseInt(n1);
			num2 = Integer.parseInt(n2);
		}catch(Exception e){
			System.out.println("FAILURE: Really?? You gotta pass in numbers... You just crashed this b****....");
			throw e;
		}
	}
	
	/*
	 * This method is accessing class level variables. This means that it is accessing variables 
	 * that are at the top of the class rather than variables that are identified in the parenthesis in the method header.
	 * 
	 * Ex: public int sum(int num1, int num2){}
	 * In this case, num1 and num2 are accessed from the method parameters/arguments (i.e. the items in parenthesis)
	 * In the case below, the variables are not listed in the method parameters, so you are accessing those that are at the top of the class.
	 * 
	 * Also, notice that none of the methods in this class will have the static modifier. Why is this?
	 * */
	public int sum(){
		return num1 + num2;
	}
	
	//1. Continue by adding methods below for multiply, divide, and subtract. Use sum as an example.
}

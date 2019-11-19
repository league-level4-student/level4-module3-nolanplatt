package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	static double divide(double arg1, double arg2) {
		if(arg2 == 0.0) {
			throw new IllegalArgumentException();
		}
		else {
			return arg1 / arg2;
		}
	}
	
	static String reverseString(String inputString) {
		if (inputString == null || inputString == "") {
	        throw new IllegalStateException();
	    }
	 
	    StringBuilder outputString = new StringBuilder(inputString).reverse();
	    return outputString.toString();
}
}

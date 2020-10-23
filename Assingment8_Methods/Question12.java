package Assingment8_Methods;

public class Question12 {

	public static void main(String[] args) {
		
		/*The danish prince most famous quote is "to be or not to be". 
		 * thats a classic example of boolean logic.
		 * the hamletQuote method only returns true if one of or
		 * both of the boolean parameters is true.
		 */
		
		System.out.println(hamletQuote(true,false));
	
	}

	private static boolean hamletQuote(boolean toBe , boolean notToBe) {
		
		if (toBe == true || notToBe == true) {
			
			return true;
			
		}else {
			
			return false;
		}
		
		
		
		
	}//end of the method

}

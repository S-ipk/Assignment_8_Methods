package Assingment8_Methods;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
	 /*isEven method gets a number(int) if its even (2,4,8...)
	  * returns true.if its odd return false.
	  */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int number = scanner.nextInt();
		
		isEven(number);
		
		boolean newisEven  = isEven(number);
		System.out.println(newisEven);

	}

	private static boolean isEven(int number) {
		
		if (number % 2 == 0) {
			return true;
			
		} else {
			return false;
		}
		
		
		
	}//end of the method

}

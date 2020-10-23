package Assingment8_Methods;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		/* Create a method called max. It gets two ints, x and max.
         * x is the test case, max is what we test against.
         */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide 2 integer numbers:");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		
		System.out.println(max(number1,number2));
		
		//if there is a value-return method we have to print it 

	}

	private static int max(int x , int max) {
		
		if (x > max) {
			return max;
			
		} else {
            return x;
		}
		
	}//end of the method

}

package Assingment8_Methods;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		/*Create a method called cube. Write all required code inside 
		 * this method in order to ask the user for a 
		 *number and then prints the cubed value of that number:
		 */
        cube();
		
	}

	private static void cube() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		int result = number *number*number;
		
		System.out.println("The result is : " + result);
	}

}

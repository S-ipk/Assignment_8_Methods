package Assingment8_Methods;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		/*Create a method called next3 . This method gets an int argument and prints
		 * the next 3 numbers after that number.
		 * Call the method from main method and pass num to it.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Provide an integer number:");
		int number = input.nextInt();
		
		next3(number);

	}

	private static void next3(int number) {
		
		for (int i = number+1; i <= number+3; i++) {
			
			System.out.println("The next three numbers -> " + i);
		}
		
		
	}

}

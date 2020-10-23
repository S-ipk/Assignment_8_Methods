package Assingment8_Methods;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*Create a method called "plus", its return is void and it gets 
		 * no arguments. It asks the user to input two numbers, then it 
		 * will add them and print the result.
         *Create a scanner within the plus method.
		 */
		plus();
	}
	
	public static void plus() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int number1 = input.nextInt();
		
		System.out.println("Enter second number:");
		int number2 = input.nextInt();
		
		int total = number1+number2;
		
		System.out.println("Sum of numbers : " + total);
		
	}

}



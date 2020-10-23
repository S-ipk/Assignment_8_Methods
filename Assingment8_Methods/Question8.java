package Assingment8_Methods;

import java.util.Scanner;



public class Question8 {

	public static void main(String[] args) {
		
		// Fibonacci Number
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        
        fib(number);
        
        
	}

	private static void fib(int number) {
		
		int firstNumber = 0;
		int secondNumber = 1;
		
		for (int i = 3; i <= number; i++) {
			
			
			int sum = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			
			System.out.println(secondNumber + " ");
			
		}//end of for loop
		
		
		
	}

}

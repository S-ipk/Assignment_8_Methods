package Assingment8_Methods;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		//Create a method called sign.
		//It gets a number and tells you if its positive, negative or zero.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = input.nextInt();
		
		//call the method 
		sign(number);
		

	}

	private static void sign(int number) {
		
		if(number > 0) {
			System.out.println(1);	
		}else if (number ==0) {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		
	}//end of the method

}

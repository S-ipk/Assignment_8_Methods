package Assingment8_Methods;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		//this method calculates a water bill
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your water bill for this month: ");
		double units = input.nextDouble();
		
		System.out.println(waterTax(units));

	}

	private static double waterTax(double units) {
		
		double bill = 0;
		
		if(units <= 50) {
			
			 bill = units * 0.60;
				
		}else if (units <= 100) {
			
			bill = units * 0.90;
			
			
		}else if (units <= 150) {
			bill = units * 0.90 + 50;
			
			
		}else {
			
			bill = units * 0.90 + 100;
		}
		return bill;
		
	}//end of the method

}

package Assingment8_Methods;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		/*c_profits gets the buyPrice(int) and sellPrice(int)
		 * and determines if there was a profit or loss.
		 * it returns a string value that can be "profit","loss","no loss"
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the item buy price:");
		int buyItem = input.nextInt();
		System.out.println("Enter the item sell price:");
		int sellItem = input.nextInt();
		
		System.out.println(c_profits(buyItem,sellItem));


	}

	private static String c_profits(int buyPrice , int sellPrice) {
		
		if (sellPrice > buyPrice) {
			return "Profit";
			
        }else if (sellPrice == buyPrice) {
        	return "no loss";
        	
        }else {
        	return "loss";
        }
		
	}//end of the method

}

package Assingment8_Methods;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter a number : ");
		int palindrome = scanner.nextInt();
        
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
 
    
    public static boolean isPalindrome(int number) {
    	
        int palindrome = number; 
        int other = 0;

        while (palindrome != 0) {
            int firstStep = palindrome % 10;
            other = other * 10 + firstStep;
            palindrome = palindrome / 10;
        }

        
        if (number == other) {
            return true;
        }
        return false;
        
    }//end of the method


}

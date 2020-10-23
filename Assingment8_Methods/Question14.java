package Assingment8_Methods;

public class Question14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true,true,false));

	}

	private static boolean threeLocks(boolean a, boolean b , boolean c) {
		
		if (a == true && b == true || c ==true) {
			
			return true;
			
		}else {
			
			return false;
		}
		
		
	}

}

package Assingment8_Methods;

public class Question17 {

	public static void main(String[] args) {
		
		
		System.out.println(getThunderBlazz(true,false,1,2,3)); //test1
		System.out.println(getThunderBlazz(false,false,1,2,3));//test2
		System.out.println(getThunderBlazz(false,false,1,5,3));//test3
		System.out.println(getThunderBlazz(false,false,3,1,2));//test4
		System.out.println(getThunderBlazz(false,false,3,1,1));//test5
		System.out.println(getThunderBlazz(false,true,9,7,3));//test6
	}

	private static boolean getThunderBlazz(boolean avilable,boolean gift, int ingredient1 , int ingredient2, int ingredient3) {
		
		if((avilable == true || gift == true) || (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3) || (ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2)) {
			
			return true;
		}else {
			return false;
		}
		
		
		
		
	}//end of the loop

	
	
			
			
		
   
}	

package Assingment8_Methods;

public class Question16 {

	public static void main(String[] args) {
		
		/*To book a room first it needs to be available for rent and
		 * make sure its available at the date selected:
		 * the room is already booked between 7/1/2018 - 7/8/2018
		 * and not available accepting bookings only for year of 2018
		 */
		
		System.out.println(simpleRoomBook(false,2,1,2018));//test1
		System.out.println(simpleRoomBook(true,2,1,2018));//test2
		System.out.println(simpleRoomBook(true,7,2,2018));//test3
	}

	private static boolean simpleRoomBook(boolean avaliability, int month, int day, int year) {
		
		if(month == 7 || avaliability == false) {
		
		   for (day = 1; day <= 8; day++) {
		  }
		   
		return false;
		}else {
			return true;
		}
	}//end of the method

	

}

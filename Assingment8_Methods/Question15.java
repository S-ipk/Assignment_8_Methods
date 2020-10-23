package Assingment8_Methods;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		/*We have a to do list app, every time a user adds a task
		 * a few things needed to be checked
         *It should not be empty. boolean parameter needs to be true
         *taskId should be only 1 greater than currentID.
         *for example if we have 7 tasks(currentId is 7)
         *so the next task id is 8 , it can't be 10.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a task number: ");
		int taskId = input.nextInt();
		
		System.out.println(validateTask(true, taskId,2));//try1
		System.out.println(validateTask(false, taskId,2));//try2

	}

	private static boolean validateTask(boolean task, int taskId, int currentId) {
		
		if(task == true && taskId > 1 && (currentId == taskId+1 || currentId == taskId -1)) {
			
			
			return true;
			
		}else {
			return false;
		}
		
		
	}//end of the loop

}

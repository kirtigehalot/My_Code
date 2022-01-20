package Java.Programs;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// To illustrate Switch case operator
		
		
		//switch (expression) case value1:// code// brea------syntax of switch
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please choose an option:");
		String Choice = s.next();
		
		switch (Choice){
	
	case "Zero": {
			
		System.out.println("You are taking Black Coffee");
		break;
		
		}
		
	case "One":{
		
		System.out.println("You are taking Black tea");
		break;
	}
	case "Three":{
		
		System.out.println("You are taking moca");
		break;
	}

	default:
	System.out.println("invalid option");
		}
		
		s.close();
		
		
	}
}
		
		


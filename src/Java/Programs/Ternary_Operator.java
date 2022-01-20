package Java.Programs;

import java.util.Scanner;

public class Ternary_Operator {

	public static void main(String[] args) {
		//syntax  variable = (condition) ? expression1 : expression2 
// To use ternary operators in java
		
		
		//take input from user
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks:");
		double marks = input.nextDouble();
		//ternary operator checks if input is greater than 40
		
		String result = (marks > 40)? "Pass" : "Fail";
		System.out.println("you "  +result+  " the exam");
		
		input.close();
	}

}

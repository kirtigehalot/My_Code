package Java.Programs;

import java.util.Scanner;

public class Boolean_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner (System.in);
		
		System.out.println("enter marks in subject1:");
		System.out.println("enter marks in subject2:");
		
		int subject1 = Scan.nextInt();
		int subject2 = Scan.nextInt();
	System.out.println("Marks entered in subject1 is:"+subject1);
	System.out.println("Marks entered in subject2 is:"+subject2);
	
	
boolean b1=true;
boolean b2=false;
	if(subject1 >= 35) {
		System.out.println(b1);
	}
	else {
		System.out.println(b2);
	}
	
	if(subject2 >= 35) {
		System.out.println(b1);
	}
	else {
		System.out.println(b2);
	}
		


		
		
	}
	
	
	
	}
	
	
	
	
	
	


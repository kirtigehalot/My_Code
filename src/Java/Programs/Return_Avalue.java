package Java.Programs;

public class Return_Avalue {

	public static void main(String[] args) { //main method
		
   int sum =  Add (300,400);       //passed value to int a,int b
          System.out.println(sum);
          
          int multiply = Multiply (10,30);
          System.out.println(multiply);
          
          int subtract = Subtract(50,30);
          System.out.println(subtract);
	}

	
	public static int Add (int a, int b) {

		return(a + b);//we are returning a integer value here
		
}
	public static int Multiply (int a, int b) {

		return(a * b);//we are returning a integer value here


	}
	public static int Subtract (int a, int b) {

		return(a - b);//we are returning a integer value here

	
	}
}
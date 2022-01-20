package Java.Programs;

public class Passing_Parameters_ToMethod {

	public static void main(String[] args) {
		//main method
		pass_method("kirti");//name is specified in main method
		
		pass_method("daksh");
		
		Add (33 , 44);//int a = 33, int b = 44
		
	}
	


	
	public static void pass_method (String name){ //parameter string name passed //method class
		
		System.out.println("hello " +name);
		
	}
		public static void  Add(int a, int b) //parameter integer passed
			
			{ System.out.println(a + b);
		}
		}
	


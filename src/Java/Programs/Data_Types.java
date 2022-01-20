package Java.Programs;

public class Data_Types {

	public static void main(String[] args) {
		// Data types declaration in java
		//byte(number, can store 1byte)
		//short(number, can store 2byte)
		//int(number, can store 4byte)
		//float(number, can store 4byte)
		//long(number, can store 8byte)
		//double(number, can store 8byte)
		//char(number, can store 2byte)
		//boolean(true or false, can store 1byte)
		
		//Java	short	16 bits / 2 bytes	-32,768 to32,767
            // Java	int	32 bits / 4 bytes	-2,147,483,648 to 2, 147,483,647
         // Java	long	64 bits / 8 bytes	,223,372,036,854,775,808 to 9,223,372,036,//
		
	     int a = 10;
		int b=20;
		int c = a+b;
System.out.println("My variable value is :" +c);
		
	System.out.println("the minimum value of integer is:" +Integer.MIN_VALUE);
	System.out.println("the maximum value of integer is:" +Integer.MAX_VALUE);
	System.out.println("the size of integer is:" +Integer.SIZE);
	
	
	System.out.println("the minimum value of long is:"+Long.MIN_VALUE);
	
	System.out.println("the maximum value of long is:"+Long.MAX_VALUE);
	System.out.println("the size of long is:"+Long.SIZE);
	
	System.out.println("the minimum value of double is:"+Double.MIN_VALUE);
	
	System.out.println("the maximum value of Double is:"+Double.MAX_VALUE);
	
	System.out.println("the size of double is:"+Double.SIZE);
	}

}

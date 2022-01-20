package Java.Programs;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		//To use Arithmetic operators
		
		
		int a = 20;
		int b= 40;
		int c = a+b;
		
		System.out.println("the value of addition is" +c);
		
		c=a-b;
		System.out.println("the value of suntraction is" +c);
		
		c = a*b;
		System.out.println("the value of multiplicaton is" +c);
		 c=a/b;
		 System.out.println("the value of division is" +c);
		 
		 c= a % b;
		 System.out.println("the value of percent is" +c);
		 
		 
		 
		 System.out.println("**********below code are for postincrement and postdecrement*****");
			b++;//b++ = b = b+1   
			System.out.println("Value of b is : "+b);
			a--;
			System.out.println("Value of a is: "+a);
			System.out.println("*************");
			System.out.println("**********below code are for Preincrement and postincrement*****");
			System.out.println("Value of b is "+b);
			++b;//++b ==> increment only 1 
			System.out.println("Value of b is : "+b);
			System.out.println("Value of a s" +a);
			--a;// - incre/decre by 1 + assigning value of variable
			System.out.println("Value of a is: "+a);
			a++;// 3+1  // First Assigning value of variable + then increment by 1
			System.out.println("Value of c is "+a);
			
			
		

	}

}

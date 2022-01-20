package Java.Programs;

public class Ternary_Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To use Ternary Operators in Java
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		boolean bvalue;
		int ivalue;
		bvalue = (c == a + b)? true:false;
		System.out.println(bvalue);
		
		bvalue = (a == b+c)? true:false;
		System.out.println(bvalue);
		
		ivalue = (c== a+b)? 50:100;
		System.out.println(ivalue);
		
		ivalue = (a == c-b)? 100:50;
		System.out.println(ivalue);

	}

}

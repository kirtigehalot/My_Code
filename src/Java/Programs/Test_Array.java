package Java.Programs;

public class Test_Array {

	public static void main(String[] args) {
		//Java Program to illustrate how to declare, instantiate, initialize  
		//and traverse the Java array.  
		
		
		int a[]=new int[5]; //declaration of array
		a[0]=10;
		a[1]=20;
		a[2]=30;//initialization of array
		a[3]=40;
		a[4]=50;
		// traversing array
		
		for(int i = 0; i <a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

package Java.Programs;

public class Acess_First_Lastelement {

	public static void main(String[] args) {
		// to access first and last element of an array
		
		
		String[]brand = { "BMW", "HONDA", "AUDI" };
		int ilength = brand.length;
		
		System.out.println("Length of Array :"+ ilength);
		
		
		//Acess first element of array
		
		String sBMW = brand[0];
		
		System.out.println("first value of array is: "+sBMW);
		//ACCESS THE LAST ELEMENT OF STRING
		
		String slastElement = brand[ilength-1];
		System.out.println("the last element of array is : " +slastElement);
		//Access all brands
		
		System.out.println("*****************");
		
		for(int i=0; i <= ilength-1; i++ ) {
			System.out.println(brand[i]);
			
			
			
		}
		

	}

}

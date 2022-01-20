package Java.Programs;

public class Ignore_Equals_Case {

	public static void main(String[] args) {
		// Declaring strings
		
		
		String str1 = "MONDAY";
		String str2 = "monday";
		
		//comparing strings
		
		//if we ignore cases
		
		boolean result1 = str2.equalsIgnoreCase(str2);
		System.out.println("str2 is equal to str1 = " +result1);
		
		// if we dont ignore cases
		
		boolean result2 = str2.matches(str1);
		System.out.println("str2 is not equal to str1= "+result2);
		
		
		
	}

}

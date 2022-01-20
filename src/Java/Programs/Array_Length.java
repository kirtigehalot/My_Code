package Java.Programs;

public class Array_Length {

	public static void main(String[] args) {
		// to find length of array
		
		//initialise an array
		
		int a[]= {100,200,300,400,500};
		
		//display array length
		
		System.out.println("the length if given array is :");
		
		System.out.println(a.length);
		 // display size of array
	    System.out.println("Size = "+ a.length);

	    // display array using length property
	    System.out.println("Array elements:");
	    for(int i=0; i < a.length; i++){
	      System.out.print(a[i]+"\t");
	    }
		
	}

}

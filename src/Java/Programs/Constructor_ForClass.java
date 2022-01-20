package Java.Programs;

public class Constructor_ForClass {

	
		// to find volume of cube
		
		
		int length;
		int breadth;
		int height;
		
		public int getCubeVolume() { //method declared returns int value
			
			return (length * breadth * height);
			
			
	}
		Constructor_ForClass(){
		
		System.out.println("we are in constructor");
		
		length = 10;//default constructor
		breadth = 14;
		height = 20;
}
		Constructor_ForClass(int l,int b,int h){ //constructor overloading
			length = l;
			breadth = b; //takes user defined values
			height = h;
		}
				
		
}
package Java.Programs;

public class Constructor_Overloading {

	double width,height,depth;
	public  Constructor_Overloading() {
	
		
		width = 22;
		height= 12;
		depth= 11;
	}
	
	public double volume() {
		return width*height*depth;
		
	}	
	
	
	public static void main(String[]args) {
		
		Constructor_Overloading box = new Constructor_Overloading();
		
		double vol = box.volume();
		
		System.out.println(vol);
	}
}

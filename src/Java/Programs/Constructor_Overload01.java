package Java.Programs;

public class Constructor_Overload01 {

	double width,height,depth;
	
	public Constructor_Overload01() //constructor is created
	{
		
		height = 12;
		
		width =10;
		depth =5;
			
			
		}
	
	public double volume() { //new constructor created
		
		return width * height *depth;
	
	}
	
	public static void main (String args[]) { //main method
		
		Constructor_Overload01 box = new Constructor_Overload01();
		
		double vol = box.volume();
		System.out.println(vol);
	}
}
		
		
	

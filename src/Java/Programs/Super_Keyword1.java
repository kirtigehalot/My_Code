package Java.Programs;

public class Super_Keyword1 {

	
	double height,width,depth;
	
	public Super_Keyword1() {
		
		height = 2;
		depth = 4;
		width = 5;
		
		
		
	}
	
	public double volume() {
		
		
		return width * height * depth;
		
	}
	   public static void main(String[] args) {
		//main method
		   
		   Super_Keyword1 box = new Super_Keyword1();
		   double vol = box.volume();
		   
		   System.out.println(vol);

	}

}

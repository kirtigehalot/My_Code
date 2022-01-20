package Java.Programs;

public class Pass_Parameter_CalculateArea {

	public static void main(String[] args) { //main method
		
  double area = Area(100,33);
  
  System.out.println(area);//will print area of rectangle
  
  float area_of_circle = Area_circle(3.14, 5.5);
  System.out.println(area_of_circle);
  
  int area_square = Square_area(12);
  System.out.println(area_square);
  
	}
	
	
	
	public static double Area (double l, double b) {
		
		return (l * b);
		
	}
		
	
	public static float Area_circle (double d , double e) {
		return (float) (d * e *e);
		
		
	}
	
	public static int Square_area (int s) {
		return (s*s);
		
	}
	}
	



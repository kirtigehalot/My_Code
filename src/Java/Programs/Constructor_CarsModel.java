package Java.Programs;

public class Constructor_CarsModel {
	
	String model;
	String colour;
	int gear;
	int tyres;
	int doors;
	boolean blefthanddrive;
	
	public Constructor_CarsModel() {
		
		model = "Camry";
		blefthanddrive = true;
		
		
	colour = "black";
	gear = 5;
	tyres = 4;
	doors = 4;
	
		
	}
	
	public void Display_Characteristics() {
		
		System.out.println("Model of my car" + model);
		System.out.println("Model of my car" + gear);
		
	}
	

}

package Java.Programs;

public class Constructor_CubeVol {

	public static void main(String[] args) {
		// to pass the constructor in main method
		
		
		Constructor_ForClass cube = new Constructor_ForClass();
		
		System.out.println(cube.getCubeVolume());
		
		Constructor_ForClass cube1 = new Constructor_ForClass(20,10,20);
		System.out.println(cube1.getCubeVolume());
	}

}

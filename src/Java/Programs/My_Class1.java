package Java.Programs;

public class My_Class1 {

	public static void main(String[] args) {
		// calling student class in main method
		Student_Class mark = new Student_Class();  //mark is object or instance
		mark.setName("mark");
		mark.setId(1);
		mark.setAge(11); 
		System.out.println(mark.name +  " is " + mark.age + "years " );
		
		
		mark.setName("tom");
		mark.setId(2);
		mark.setAge(14); 
		System.out.println(mark.name +  " is " + mark.age + "years " );


	}

}

package Java.Programs;

class Person{ //parent class
	String name ="Monica" ;
	
}

public class Employee extends Person {//child class..trying to access 
	String name = "Sameer";              //variables of parent class using word "extends"
	
	public void display() {
		
		System.out.println("super class employee name:" +super.name);//call variable of parent class using word "super"
		
		System.out.println("sub class employee name:" +name);
		
		
	}

	
public static void main(String[] args) {

	Employee e = new Employee ();//created object refrence
	
	e.display();
	

	}

}

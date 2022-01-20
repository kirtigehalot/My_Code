package Java.Programs;

class PersonMethod{ //parent class
	String name ="Monica" ;
	public void display() {
		System.out.println("this is super class"); //parent class
	
}
}
public class EmployeeMethod extends PersonMethod {//child class..trying to access 
	String name = "Sameer";    //variables of parent class using word "extends"
	
		public void display() { //display method is declared
		
		System.out.println("super class employee name:" +super.name);//call variable of parent class using word "super"
		
		System.out.println("sub class employee name:" +name);
		
		
	}
		public void finaldisplay() { //calling display method  of parent class 
			super.display();
		}
public static void main(String[] args) {

	EmployeeMethod e = new EmployeeMethod ();  //created object refrence
	
	e.display();//class sub class method
	e.finaldisplay();//calls super class method

	}

}

	



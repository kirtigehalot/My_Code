package Java.Programs;


//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
int id=2;  
String name="lolo";  
}  
//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
public static void main(String args[]){  
Student s1=new Student();  
System.out.println(s1.id);  
System.out.println(s1.name);  
}  
}  
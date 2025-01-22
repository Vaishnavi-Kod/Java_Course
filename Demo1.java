/*Create a parent class called "Person" with attributes such as name, age, and 
a method called "speak". Create a child class called "Student" that inherits from
Person and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

package oopsfeature;
//This is a parent class
class Person{
	String name;
	int age;
	void speak()
	{
		System.out.println("This is speak method");
	}
}
//This is child class that accessing properties of Parent class
class Student extends Person{
	char grade;
	void study() {
		System.out.println("This is study method");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//Creating object of child class
		Student s=new Student();
		s.speak();
		s.study();

	}

}
/*Output
   This is speak method
   This is study method


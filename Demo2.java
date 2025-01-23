/*Create a parent class called "Vehicle" with attributes such as
brand, model, year, and a method called "drive". Create a child 
class called "Car" that inherits from Vehicle and has an additional 
attribute called "color" and a method called "honk". Create an object
 of the Car class and call both the "drive" and "honk" methods.*/

package oopsfeature;
class Vehicle{ // Parent class
	String brand;
	String model;
	int year;
	Vehicle(String brand,String model,int year){
		this.brand= brand;
		this.model=model; 
		this.year=year;
	}
	void drive() {
		System.out.println("Driving.....");
	}

}
//This is a child class is accessing properties of parent class
class Car extends Vehicle{
	String color;
	Car(String brand, String model, int year, String color) {
		super(brand, model, year);
		this.color=color;
	}
	void honk() {
		System.out.println("Honking......");
	}

}
public class Demo2 {

	public static void main(String[] args) {
		// Create an object of the Car class
		Car car =new Car("Toyota", "Camry", 2020, "Blue");
		// Call both the "drive" and "honk" methods
		car.drive();
		car.honk();

	}

}

/*Output:
Driving.....
Honking......
 */

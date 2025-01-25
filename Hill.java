package oopsfeature;
/*Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. 
As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime.
ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
 */
//superclass HillStations
class HillStations{
	//Methods to be overridden
	public void location() {
		System.out.println("Location of Hill Station.");
	}

	public void famousFor() {
		System.out.println("Famous for scenic beauty.");
	}
}
//subclass Manali
class Manali extends HillStations{
	//Override
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}

	//Override
	public void famousFor() {
		System.out.println("Manali is famous for adventure sports and snow-capped mountains.");
	}
}
//subclass Mussoorie
class Mussoorie extends HillStations{
	//Override
	public void location() {
		System.out.println("Manali is located in Himachal Pradesh.");
	}
	//Override
	public void famousFor() {
		System.out.println("Manali is famous for adventure sports and snow-capped mountains.");
	}
}
//subclass Gulmarg
class Gulmarg extends HillStations{
	//Override
	public void location() {
		System.out.println("Gulmarg is located in Jammu and Kashmir.");
	}

	//Override
	public void famousFor() {
		System.out.println("Gulmarg is famous for skiing and picturesque landscapes.");
	}
}

public class Hill {

	public static void main(String[] args) {
		//calling by parent class
		System.out.println("Calling by using Parent class");
		//creating reference of a class
		HillStations h=new Manali();
		h.location();
		h.famousFor();
		HillStations h1=new Mussoorie();
		h1.location();
		h1.famousFor();
		HillStations h2=new Gulmarg();
		h2.location();
		h2.famousFor();
		//calling by subclasses
		System.out.println("Calling by using subclasses");
		Manali m=new Manali();
		m.location();
		m.famousFor();
		Mussoorie ms=new Mussoorie();
		ms.location();
		ms.famousFor();
		Gulmarg g=new Gulmarg();
		g.location();
		g.famousFor();		
	}
}

/*Output:
 * Calling by using Parent class
   Manali is located in Himachal Pradesh.
   Manali is famous for adventure sports and snow-capped mountains.
   Manali is located in Himachal Pradesh.
   Manali is famous for adventure sports and snow-capped mountains.
   Gulmarg is located in Jammu and Kashmir.
   Gulmarg is famous for skiing and picturesque landscapes.
 * Calling by using subclasses
   Manali is located in Himachal Pradesh.
   Manali is famous for adventure sports and snow-capped mountains.
   Manali is located in Himachal Pradesh.
   Manali is famous for adventure sports and snow-capped mountains.
   Gulmarg is located in Jammu and Kashmir.
   Gulmarg is famous for skiing and picturesque landscapes.
 */

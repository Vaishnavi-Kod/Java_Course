//Write a Java Program  to pass  this keyword as argument in the constructor call.

package oopsfeature;

public class ThisKeyword_Argument {
	String city;
	String address;
	ThisKeyword_Argument(String city,String address)//this is parameterized constructor
	{
		//this keyword assign the current value to instance variable
		this.city=city;
		this.address=address;
	}
	void show()//used to display the data
	{
		System.out.println("City:"+city+" Address:"+address);
	}

	public static void main(String[] args) {
		//creating object of a class
		//passing values to the parameterized constructor
		ThisKeyword_Argument th=new ThisKeyword_Argument("Solapur","Ashok chowk");
		th.show();//call the show method 

	}
}

/*Output:
 * City:Solapur Address:Ashok chowk
 */

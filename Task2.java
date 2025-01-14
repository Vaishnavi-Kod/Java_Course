//write a program to find the perimeter of the square

package oopsfeature;
import java.util.Scanner;//Scanner is predefined class of util package

public class Task2 {

	public static void main(String[] args) {
		//logic
		Scanner sc=new Scanner(System.in);//creating object of scanner
		//taking input from user
		System.out.println("Enter the side of Square:");
		float side=sc.nextFloat();//variable declaration and initialization
		float peri=4*side;
		//displaying output
		System.out.println("Permiter of a Square is "+peri);
	}

}
/*Output 
  Enter the side of Square:
  4
  Permiter of a Square is 16.0
 * */

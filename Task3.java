//Write a program to check leap year using if else. How to check whether a given year is a leap year or not
package oopsfeature;
import java.util.Scanner;//scanner is predefined class of util package
public class Task3 {

	public static void main(String[] args) {
		//logic
		Scanner sc=new Scanner(System.in);//creating object of scanner
		System.out.println("Enter the Year:");
		int year=sc.nextInt();//variable declaration

		if(year % 4==0) //it checks year is divisible by 4 or not
			System.out.println("This is a leap year");			
		else//else will execute if condition is wrong
			System.out.println("This is not a leap year");
	}

}

/*Output
 * Enter the Year:
   2004
   This is a leap year
 * Enter the Year:
   2014
   This is not a leap year
 */

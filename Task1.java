/*Write a Java program to take Employee id,name,address & salary 
 * from user and display on to screen.
 */

package oopsfeature;
import java.util.Scanner;//Scanner is predefined class of util package


public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		//Logic
		System.out.println("Enter the Employee Id:");
		int emp_id=sc.nextInt();//variable declaration and initialization
		System.out.println("Employee id="+emp_id);

		System.out.println("Enter the Employee Name:");
		String emp_name=sc.nextLine();//variable declaration and initialization
		System.out.println("Employee Name="+emp_name);

		System.out.println("Enter the Employee Address:");
		String emp_addr=sc.nextLine();//variable declaration and initialization
		System.out.println("Address="+emp_addr);

		System.out.println("Enter the Employee Salary:");
		int emp_sal=sc.nextInt();//variable declaration and initialization
		System.out.println("Employee Salary="+emp_sal);	
	}

}

/*Output
 Enter the Employee Id:
 102
 Employee id=102
 Enter the Employee Name:
 Neha Katkam
 Employee Name=Neha Katkam
 Enter the Employee Address:
 Ahowk chowk,Solapur
 Address=Ahowk chowk,Solapur
 Enter the Employee Salary:
 12000
 Employee Salary=12000
 */

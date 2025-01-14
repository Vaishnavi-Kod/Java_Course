// Write java program to check  candidate eligible for voting or not
package oopsfeature;
import java.util.Scanner;//Scanner is predefined class of util package
public class Task4 {

	public static void main(String[] args) {
		//Logic
		Scanner sc=new Scanner(System.in);//creating object of scanner
		System.out.println("Enter the age of candidate:");
		int age=sc.nextInt();//variable declaration and it stores the value which the user enter
		if (age>18)//checks if age is greater than 18 
			System.out.println("Candidate is illegible for voting");
		else//if not this part will be executed
			System.out.println("Candidate is not illegible for voting");
	}

}

/*Output:
 * Enter the age of candidate:
   20
   Candidate is illegible for voting
 * Enter the age of candidate:
   10
   Candidate is not illegible for voting

 * */

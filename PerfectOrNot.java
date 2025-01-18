//Write a program to check whether the number is perfect or not.
/*Perfect Number: A number is a perfect number if is equal to sum of its proper
  divisors, that is, sum of its positive divisors excluding the number itself.
  For example- 6=1+2+3=6
 */
package oopsfeature;
import java.util.Scanner;
public class PerfectOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");//Taking input from user
		int num=sc.nextInt();//Storing the number in num variable
		int sum=0;//variable declaration and initialization
		for(int i=1;i<num;i++)//for loop used when we know how many times it would be run
		{
			if(num % i==0)//if is used to check condition that num gives reminder 0
				sum=sum+i;//sum is used to add updated sum and i value			  
		}
		if(sum==num)//checks sum value equal to num value(user entered value)
			System.out.println(num+" is Perfect Number");
		else//run when if condition fails
			System.out.println(num+" is not Perfect Number");
	}
}

/*Output:
 * Enter a number:
   6
   6 is Perfect Number

 * Enter a number:
   2
   2 is not Perfect Number
 */

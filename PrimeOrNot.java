//Write a program to check the number is prime or not.
/*Prime Number:A natural number greater than 1 that has no positive divisors
  other than 1 or itself.
  for example-5 is a prime number because it can only be divided by 1 and 5.
 */
package oopsfeature;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int flag=0;//first initialize flag to 0
		// 0 and 1 are not prime numbers
		// change flag to 1 for non-prime number
		if (num == 0 || num == 1)
			flag = 1;
		for(int i=2;i<=num/2;i++)//for loop used when we know how many times it would be run
		{
			if (num % i == 0)//in each iteration, whether num is perfectly divisible by i is checked
			{
				flag = 1;//flag is set to 1
				break;//loop will be terminated
			}

		}
		if (flag == 0)//if flag remains 0 it is prime number
			System.out.println(num+" is a prime number.");

		else
			System.out.println(num+" is not a prime number.");
	}
}

/*Output:
 * Enter a number:
   5
   5 is a prime number.

 * Enter a number:
   1
   1 is not a prime number.
 */

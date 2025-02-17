//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package oopsfeature;

public class ArthmeticException {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			//to divide by zero will cause an ArithmeticException
			int ans=30/0;
		}
		//catch:catch block is used to handle exception.
		// It catches an ArithmeticException (divide by zero in this case)
		catch(ArithmeticException e){
			System.out.println(e);
		}
		// After the exception is handled, the program continues to this line.
		System.out.println("Arithmetic exception");
	}

}

/*Output:
  java.lang.ArithmeticException: / by zero
  Arithmetic exception
 */


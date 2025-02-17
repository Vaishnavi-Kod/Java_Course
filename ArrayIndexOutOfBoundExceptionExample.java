//3.Write a program using exception handling to handle array index out of bounds.
package oopsfeature;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			// Creating an array of size 10
			int arr[]=new int[10];
			// Attempting to access index 20, which is out of bounds
			arr[20]=111;
		}
		//catch:catch block is used to handle exception.
		catch(Exception e) {
			System.out.println(e);
		}
		// After the exception is handled, the program continues to this line
		System.out.println("hiii");
	}

}

/*Output:
  java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
  hiii
 */

//2.Write a program demonstrating multiple catch statements and finally block.

package oopsfeature;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			// Creating an array of size 10
			int arr[]=new int[10];
			// Attempting to access index 20, which is outside the array bounds.
			arr[20]=111;
		}
		//catch:catch block is used to handle exception.
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		 // Since we are trying to access an out-of-bounds index, this block will be executed.
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		// finally: This block is always executed, whether an exception was thrown or not.
		finally
		{
			System.out.println("Finally block");
		}

	}

}

/*Output:
  ArrayIndexOutOfBoundsException
  Finally block
 */

//Write java program to invoke current class method using this keyword
package oopsfeature;

public class Invoke_ThisKeyword {
	// Method to be invoked using 'this' keyword
     void dispmsg()
     {
    	 System.out.println("This is display message method");
     }
    // Another method that calls the dispmsg method using 'this'
     void invokemethod()
     {
    	// Using 'this' to call the dismsg method of the current class
    	 this.dispmsg();
     }
	public static void main(String[] args) {
		//creating instance/object of a class
		Invoke_ThisKeyword i=new Invoke_ThisKeyword();
		// Calling the invokemethod which uses 'this' to call dispmsg
		i.invokemethod();//Calling the invokemethod which uses 'this' to call dispmsg

	}

}

/*Output:
 * This is display message method
 */

//1. Write a program using Vector to store the list of students details and print the details.

package oopsfeature;
import java.util.Vector;
/* vector :is dynamic array in collection used to store element
 * vector is synchronized.
 */
public class VectorAss {

	public static void main(String[] args) {
		// Creating an object of Vector to store student name
		Vector<String> student=new Vector<String>();
		// Adding student names to the Vector
		student.add("Sonali");
		student.add("Rohini");
		student.add("Aishwarya");
		student.add("Gouri");
		// Printing the Vector, which contains student details
		System.out.println(student);

	}

}

/*Output
 * [Sonali, Rohini, Aishwarya, Gouri]
 */

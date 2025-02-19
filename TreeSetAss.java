//3.Write a program using TreeSet insert Integer values and print them.

package oopsfeature;
/*
 * TreeSet: A part of Java's Collection framework.
 * Stores unique elements in a sorted order.
 * Implements the SortedSet interface.
 * It does not allow null elements.
 */
import java.util.TreeSet;

public class TreeSetAss {

	public static void main(String[] args) {
		// Creating a TreeSet to store integer values
		TreeSet<Integer> number = new TreeSet<Integer>();
		// Adding integer values to the TreeSet
		number.add(50);
		number.add(20);
		number.add(40);
		number.add(10);
		number.add(30);
		// Displaying the TreeSet (elements will be in sorted order)
		System.out.println("Sorted TreeSet: " + number);

	}

}

/*Output
  Sorted TreeSet: [10, 20, 30, 40, 50]
 */

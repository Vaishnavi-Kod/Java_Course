//2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.

package oopsfeature;

import java.util.ArrayDeque;

/*dequeue:it is an interface.it is double ended queue.where insertion and deletion perform in both ends.
 */
public class ArrayDequeAss {

	public static void main(String[] args) {
		// Creating an ArrayDeque to store book names
		ArrayDeque<String> book=new ArrayDeque<String>();
		// Adding books to the queue
		book.add("Harry Potter");
		book.add("The Hobbit ");
		book.add("Pride and Prejudice");
		book.add("Sherlock Holmes");
		System.out.println("Initial Book Queue: " + book);

		// Adding books to the front and rear
		book.addFirst("Rich Dad Poor Dad");
		book.addLast("Game of Thrones");

		// Displaying the queue after adding elements
		System.out.println("After adding at first & last: " + book);

		// Removing books from both ends
		book.removeFirst();
		book.removeLast();

		// Displaying the queue after removing elements
		System.out.println("After removing from first & last: " + book);

	}

}

/*Output
  Initial Book Queue: [Harry Potter, The Hobbit , Pride and Prejudice, Sherlock Holmes]
  After adding at first & last: [Rich Dad Poor Dad, Harry Potter, The Hobbit , Pride and Prejudice, Sherlock Holmes, Game of Thrones]
  After removing from first & last: [Harry Potter, The Hobbit , Pride and Prejudice, Sherlock Holmes]

 */

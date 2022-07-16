// Java Program to find the index of the element
// in the TreeSet using Iterator
// Using an Iterator

// Importing Iterator and TreeSet class from
// java.util package
import java.util.Iterator;
import java.util.TreeSet;

// Class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of TreeSet class
		// Declaring object of Integer type
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		// Adding the elements to the TreeSet
		// Custom inputs
		treeSet.add(34);
		treeSet.add(23);
		treeSet.add(43);
		treeSet.add(41);
		treeSet.add(35);
		treeSet.add(33);

		// Printing the element in the TreeSet
		System.out.println("TreeSet contains: " + treeSet);

		// Printing the indexes of elements in above TreeSet
		// object
		System.out.println("Index of 23: "
						+ indexOf(treeSet, 23));
		System.out.println("Index of 43: "
						+ indexOf(treeSet, 43));
		System.out.println("Index of 35: "
						+ indexOf(treeSet, 35));
		System.out.println("Index of 55: "
						+ indexOf(treeSet, 55));
	}

	// Method - indexOf()
	private static int indexOf(TreeSet<Integer> set,
							Integer element)
	{

		int index = -1;

		// Get an iterator
		Iterator<Integer> itr = set.iterator();

		Integer currentElement = null;
		int currentIndex = 0;

		// Condition check using hasNext() method which
		// holds true till single element in List is
		// remaining
		while (itr.hasNext()) {

			currentElement = itr.next();

			// Checking if the current element equals
			// the element whose index is tried to search
			if (currentElement.equals(element)) {

				// Return the index of the element
				return currentIndex;
			}

			// Increment the index number
			currentIndex++;
		}

		// Return the index -1
		// if the element do not exists
		return index;
	}
}

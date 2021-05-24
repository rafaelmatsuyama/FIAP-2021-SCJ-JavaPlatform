package colecoes.HashTable;

import java.util.Arrays;

public class HashFunction {

	String[] theArray;
	int arraySize;
	int itemsInArray = 0;

	public static void main(String[] args) {

		HashFunction theFunc = new HashFunction(30);

		// Simplest Hash Function
		String[] elementsToAdd = { "1", "5", "17", "21", "26" };
		theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

		theFunc.findKey("26");

	}

	// Simple Hash Function that puts values in the same
	// index that matches their value

	public void hashFunction1(String[] stringsForArray, String[] theArray) {

		for (int n = 0; n < stringsForArray.length; n++) {

			String newElementVal = stringsForArray[n];
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}

	// Returns the value stored in the Hash Table

	public String findKey(String key) {

		// Find the keys original hash key
		int arrayIndexHash = Integer.parseInt(key) % 29;

		while (theArray[arrayIndexHash] != "-1") {

			if (theArray[arrayIndexHash] == key) {

				// Found the key so return it
				System.out.println(key + " was found in index " + arrayIndexHash);
				return theArray[arrayIndexHash];

			}

			// Look in the next index

			++arrayIndexHash;

			// If we get to the end of the array go back to index 0

			arrayIndexHash %= arraySize;

		}

		// Couldn't locate the key
		return null;

	}

	private HashFunction(int size) {

		arraySize = size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");

	}

}
package colecoes.Vector;

import java.util.Vector;

public class TesteVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();

		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.add("d");
		vector.add("e");

		for (int i = 0; i < vector.size(); i++) {
			System.out.println("vector " + i + ": " + vector.get(i));
		}

	}

}

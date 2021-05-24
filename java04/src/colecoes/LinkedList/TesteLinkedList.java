package colecoes.LinkedList;

import java.util.LinkedList;

public class TesteLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println("listaString " + i + ": " + ll.get(i));
		}

	}

}

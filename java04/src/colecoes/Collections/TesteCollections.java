package colecoes.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> listaString = new ArrayList<String>();

		listaString.add("c");
		listaString.add("b");
		listaString.add("a");
		listaString.add("d");

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

		listaString = Collections.emptyList();
		System.out.println(listaString.size());

		listaString = new ArrayList<String>();
		listaString.add("c");
		listaString.add("b");
		listaString.add("a");
		listaString.add("d");

		System.out.println("\n\n");

		int index = Collections.binarySearch(listaString, "a");
		System.out.println("Encontrado o item a na posição " + index);

		System.out.println("\n\n");

		Collections.sort(listaString);

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

		index = Collections.binarySearch(listaString, "a");
		System.out.println("Encontrado o item a na posição " + index);

		System.out.println("\n\n");
		Collections.shuffle(listaString);

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

		System.out.println("\n\n");
		Collections.reverse(listaString);

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

		System.out.println("\n\n");
		Collections.swap(listaString, 1, 2);

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

	}

}

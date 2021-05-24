package colecoes.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class TesteListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> listaString = new ArrayList<String>();

		listaString.add("a");
		listaString.add("b");
		listaString.add("c");
		listaString.add("d");

		for (int i = 0; i < listaString.size(); i++) {
			System.out.println("listaString " + i + ": " + listaString.get(i));
		}

		ListIterator<String> iterador = listaString.listIterator();

		try {
			while (iterador.hasPrevious()) {
				String valor = iterador.previous();
				System.out.println("Valor " + valor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

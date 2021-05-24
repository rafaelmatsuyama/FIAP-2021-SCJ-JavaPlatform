package colecoes.Iterator;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class TesteIterator {

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

		Iterator<String> iterador = listaString.iterator();

		int i = 0;

		try {
			while (iterador.hasNext()) {
				String valor = "";
				try {
					valor = iterador.next();
					System.out.println("Valor " + valor);
				} catch (ConcurrentModificationException c) {
					iterador = listaString.iterator();
				}

				if (i == 0) {
					listaString.remove(3);
				}

				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

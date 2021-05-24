package colecoes.RandomAccess;

import java.util.ArrayList;

public class TesteRandomAccess {

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

	}

}

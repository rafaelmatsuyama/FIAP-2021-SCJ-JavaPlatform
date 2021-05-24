package colecoes.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class TesteHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> nomes = new Hashtable<Integer, String>();

		nomes.put(1, "Maria");
		nomes.put(2, "José");
		nomes.put(3, "Henrique");
		nomes.put(4, "Matias");
		nomes.put(5, "Nascimento");
		nomes.put(6, "Maria");

		System.out.println(nomes);
		System.out.println(nomes.get(2));

	}

}

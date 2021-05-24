package colecoes.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TesteTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortedMap<Integer, String> nomes = new TreeMap<Integer, String>();

		nomes.put(1, "Maria");
		nomes.put(5, "Nascimento");
		nomes.put(4, "Matias");
		nomes.put(2, "José");
		nomes.put(3, "Henrique");
		nomes.put(6, "Maria");

		System.out.println(nomes);
		System.out.println(nomes.get(2));

		SortedMap<Integer, String> nomesSelecionados = nomes.headMap(5);
		System.out.println(nomesSelecionados);
		SortedMap<Integer, String> nomesSelecionados2 = nomes.subMap(1, 3);
		System.out.println(nomesSelecionados2);
		SortedMap<Integer, String> nomesSelecionados3 = nomes.tailMap(5);
		System.out.println(nomesSelecionados3);
	}

}

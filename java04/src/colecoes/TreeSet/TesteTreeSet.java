package colecoes.TreeSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class TesteTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortedSet<String> nomes = new TreeSet<String>();

		nomes.add("Maria");
		nomes.add("José");
		nomes.add("Henrique");
		nomes.add("Matias");
		nomes.add("Nascimento");
		nomes.add("Maria");

		System.out.println(nomes);
		System.out.println(nomes.contains("José"));

	}

}

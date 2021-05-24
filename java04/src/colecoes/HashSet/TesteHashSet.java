package colecoes.HashSet;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> nomes = new HashSet<String>();

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

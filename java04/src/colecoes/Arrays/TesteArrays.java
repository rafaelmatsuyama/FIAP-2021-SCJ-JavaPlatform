package colecoes.Arrays;

import java.util.Arrays;
import java.util.List;

public class TesteArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] listaString = new String[10];

		listaString[0] = "a";
		listaString[1] = "h";
		listaString[2] = "y";
		listaString[3] = "q";
		listaString[4] = "p";
		listaString[5] = "k";
		listaString[6] = "s";
		listaString[7] = "b";
		listaString[8] = "u";
		listaString[9] = "t";

		for (int i = 0; i < listaString.length; i++) {
			System.out.println("listaString " + i + ": " + listaString[i]);
		}

		System.out.println("\n");

		Arrays.sort(listaString);

		for (int i = 0; i < listaString.length; i++) {
			System.out.println("listaString " + i + ": " + listaString[i]);
		}

		System.out.println("\n");

		int indice = Arrays.binarySearch(listaString, "b");
		System.out.println("O valor b está no índice " + indice);

		System.out.println("\n");

		String[] listaString2 = new String[10];

		listaString2[0] = "1";
		listaString2[1] = "h";
		listaString2[2] = "y";
		listaString2[3] = "q";
		listaString2[4] = "p";
		listaString2[5] = "k";
		listaString2[6] = "s";
		listaString2[7] = "b";
		listaString2[8] = "u";
		listaString2[9] = "t";

		String[] listaString3 = new String[10];

		listaString3[0] = "a";
		listaString3[1] = "h";
		listaString3[2] = "y";
		listaString3[3] = "q";
		listaString3[4] = "p";
		listaString3[5] = "k";
		listaString3[6] = "s";
		listaString3[7] = "b";
		listaString3[8] = "u";
		listaString3[9] = "t";

		Arrays.sort(listaString3);

		boolean igualdade = Arrays.equals(listaString, listaString2);
		System.out.println("O array listaString é igual a listaString2? " + igualdade);
		igualdade = Arrays.equals(listaString, listaString3);
		System.out.println("O array listaString é igual a listaString3? " + igualdade);

		System.out.println("\n");

		Arrays.fill(listaString, "j");

		for (int i = 0; i < listaString.length; i++) {
			System.out.println("listaString " + i + ": " + listaString[i]);
		}

		System.out.println("\n");

		int hashcode1 = Arrays.hashCode(listaString);
		int hashcode2 = Arrays.hashCode(listaString2);
		int hashcode3 = Arrays.hashCode(listaString3);

		System.out.println("listaString1 hascode " + hashcode1);
		System.out.println("listaString2 hascode " + hashcode2);
		System.out.println("listaString3 hascode " + hashcode3);

		System.out.println("\n");
		Arrays.fill(listaString2, "j");

		hashcode1 = Arrays.hashCode(listaString);
		hashcode2 = Arrays.hashCode(listaString2);
		hashcode3 = Arrays.hashCode(listaString3);

		System.out.println("listaString1 hascode " + hashcode1);
		System.out.println("listaString2 hascode " + hashcode2);
		System.out.println("listaString3 hascode " + hashcode3);

		System.out.println("\n");
		System.out.println(listaString);
		System.out.println(Arrays.toString(listaString));

		System.out.println("\n");
		List<String> lista = Arrays.asList(listaString);
		System.out.println(lista.toString());

	}

}

package colecoes.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TesteComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente3 = new Cliente(774, "D. Matias");
		Cliente cliente1 = new Cliente(4, "B. João");
		Cliente cliente2 = new Cliente(3, "Z. Maria");
		Cliente cliente4 = new Cliente(28, "A. Marcelo");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);

		Iterator<Cliente> iterador = listaCliente.iterator();
		System.out.println("Lista original");
		while (iterador.hasNext()) {
			Cliente cliente = iterador.next();
			System.out.println("ID " + cliente.getIdentificacao() + " " + cliente);
		}

		Collections.sort(listaCliente);
		iterador = listaCliente.iterator();

		System.out.println("Lista ordenada por Id");
		while (iterador.hasNext()) {
			Cliente cliente = iterador.next();
			System.out.println("ID " + cliente.getIdentificacao() + " " + cliente);
		}

		Comparador comparador = new Comparador();
		Collections.sort(listaCliente, comparador);
		iterador = listaCliente.iterator();

		System.out.println("Lista ordenada pelo Nome");
		while (iterador.hasNext()) {
			Cliente cliente = iterador.next();
			System.out.println("ID " + cliente.getIdentificacao() + " " + cliente);
		}

	}

}

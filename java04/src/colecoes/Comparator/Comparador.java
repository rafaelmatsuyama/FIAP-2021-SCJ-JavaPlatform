package colecoes.Comparator;

import java.util.Comparator;

public class Comparador implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente, Cliente outroCliente) {
		return cliente.getNome().compareTo(outroCliente.getNome());
	}

}

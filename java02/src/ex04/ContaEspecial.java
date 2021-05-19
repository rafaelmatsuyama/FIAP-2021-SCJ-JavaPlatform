package ex04;

import java.time.LocalDate;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento,
			LocalDate dataRegistro) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataRegistro);
	}

	@Override
	public void saque(double valor) {
		// super.saque(valor);
		this.saldo -= (valor + 0.10);
	}

}

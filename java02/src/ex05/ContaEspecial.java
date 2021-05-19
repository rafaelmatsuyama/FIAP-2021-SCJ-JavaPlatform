package ex05;

import java.time.LocalDate;

public class ContaEspecial extends ContaBancaria implements Tributacao {

	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento,
			LocalDate dataRegistro) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataRegistro);
	}

	@Override
	public void saque(double valor) {
		// super.saque(valor);
		this.saldo -= (valor + 0.10);
	}

	@Override
	public double calcularTributo() {
		return saldo*0.03;
	}

}

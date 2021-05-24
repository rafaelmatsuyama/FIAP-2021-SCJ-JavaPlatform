package ex04;

import java.time.LocalDate;

public class ContaEspecial extends ContaBancaria{
	
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento,
			LocalDate dataRegistro) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataRegistro);
	}

	public void saque(double valor){
		saldo -= (valor+valor*0.1);
	}
	
	public void deposita(double valor){
		saldo += (valor - valor*0.1);
	}

}

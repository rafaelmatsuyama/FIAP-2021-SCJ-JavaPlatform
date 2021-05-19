package ex05;

import java.time.LocalDate;

public class ContaDigital extends ContaBancaria{
	
	public ContaDigital(String nomeCliente, String cpfCliente, 
			LocalDate dataNascimento, LocalDate dataRegistro) {
		super(nomeCliente, cpfCliente, dataNascimento, dataRegistro);
	}

	public void saque(double valor) {		
		if (super.getSaldo() - valor < 0){
			System.out.println("Saldo Insuficiente para o Saque.");
		}
		// super.saque(valor);
		saldo -= valor;
	}
	
}

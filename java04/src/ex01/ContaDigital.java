package ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ContaDigital extends ContaBancaria {
	
	public ContaDigital(String nomeCliente, String endCliente, String cpfCliente, 
			LocalDate dataNascimento, LocalDate dataRegistro) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataRegistro);
	}

	public void saque(double valor) throws SaldoInsuficiente{
		
		if (super.getSaldo() - (valor - 0.10) < 0){
			throw new SaldoInsuficiente("Saldo Insuficiente para o Saque.");
		}
		
		long meses = ChronoUnit.MONTHS.between(dataRegistro, LocalDateTime.now());
		
		if (ChronoUnit.MONTHS.between(dataRegistro, LocalDateTime.now()) >= 12){
			System.out.println("Parabéns, já está conosco há "+meses+" meses!");
			super.setSaldo(super.getSaldo() - valor);
		}
		else
		{
			super.setSaldo(super.getSaldo() - valor - 0.10);
		}
		
	}
	

	public boolean equals(Object obj) {
		ContaDigital conta = (ContaDigital) obj;
		return (conta.cpfCliente.equals(this.cpfCliente));
	}
}

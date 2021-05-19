package ex05;

import java.time.LocalDate;

public class TesteContas {

	public static void main(String[] args) {
		ContaDigital conta1 = new ContaDigital("João", "1234", LocalDate.of(1981, 1, 12), LocalDate.now());
		conta1.deposita(1000);
		conta1.saque(100);
		System.out.println(conta1.getSaldo());
		
		ContaEspecial conta2 = new ContaEspecial("João", "Rua A, 123", "1234", LocalDate.of(1981, 1, 12), LocalDate.now());
		conta2.deposita(1000);
		conta2.saque(100);
		System.out.println(conta2.getSaldo());
		System.out.println(conta2.calcularTributo());

	}
	
	

}

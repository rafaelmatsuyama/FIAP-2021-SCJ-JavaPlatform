package ex01;

import ex01.ContaPoupanca;

public class TesteSaldoInsuficiente {

	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca("José da Silva", "Rua A, 123", "1234567");
		conta1.deposita(100);
		try {
			conta1.saque(120);
		} catch (SaldoInsuficiente e) {
			System.out.println(e.getMessage());
		}

	}

}

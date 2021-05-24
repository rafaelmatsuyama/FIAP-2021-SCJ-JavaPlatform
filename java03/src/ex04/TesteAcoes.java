package ex04;

import java.time.LocalDate;


public class TesteAcoes {

	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca("José da Silva", "Rua A, 123", "1234567",
				LocalDate.of(1981,4,25),LocalDate.of(2014,9,6));
		
		
		ContaEspecial conta2 = new ContaEspecial("João Pedro", "Rua B, 433", "7876363",
				LocalDate.of(1981,12,25),LocalDate.of(2034,9,6));
		
		depositarPoupanca(conta1);
		depositarEspecial(conta2);
		
		saldoPoupanca(conta1);
		
		try {
			saquePoupanca(conta1);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		saqueEspecial(conta2);

	}
	
	public static void depositarPoupanca(ContaPoupanca conta){
		conta.deposita(100);
	}
	
	public static void depositarEspecial(ContaEspecial conta){
		conta.deposita(150);
	}
	
	public static void saldoPoupanca(ContaPoupanca conta){
		System.out.println(conta.getSaldo());
	}
	
	public static void saquePoupanca(ContaPoupanca conta) throws SaldoInsuficiente{
		conta.saque(40);
	}
	
	public static void saqueEspecial(ContaEspecial conta){
		conta.saque(50);
	}
	

}

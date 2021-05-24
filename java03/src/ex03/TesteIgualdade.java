package ex03;

public class TesteIgualdade {

	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca("José da Silva", "Rua A, 123", "1234567");	
		ContaPoupanca conta2 = new ContaPoupanca("João Moraes", "Rua C, 33", "1234567");
		ContaPoupanca conta3 = new ContaPoupanca("Maria Henrique", "Rua D, 11", "12345678");
		
		System.out.println("Conta1 = Conta2 " + conta1.equals(conta2));
		System.out.println("Conta1 = Conta3? " + conta1.equals(conta3));
		
	}

}

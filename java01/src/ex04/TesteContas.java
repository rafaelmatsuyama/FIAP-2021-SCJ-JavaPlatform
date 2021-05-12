package ex04;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saque(10);
		System.out.println(c1.getSaldo());
		
		// adicionando nova conta bancária
		ContaBancaria c2 = new ContaBancaria();
		c2.saldo = 1000.0;
		System.out.println(c2.getSaldo());
		c1.saldo = 200.0;
		System.out.println(c1.getSaldo());

		c2 = c1;
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());

		if(c1 == c2){
		    System.out.println("iguais");
		} else {
		    System.out.println("diferentes");
		}


	}

}
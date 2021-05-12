package ex06;

public class TesteContas {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		c1.setTitular("Dan");
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saque(10);
		System.out.println(c1.getSaldo());
		System.out.println(c1.getTitular());
	}
}
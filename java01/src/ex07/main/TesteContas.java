package ex07.main;

import ex07.model.ContaBancaria;

/**
 * @author dnvtrn
 *
 */
public class TesteContas {

	/**
	 * @param args
	 */
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
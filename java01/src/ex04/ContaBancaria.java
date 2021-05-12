package ex04;

public class ContaBancaria {

	protected double saldo;

	public void saque(double valor){
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	public double getSaldo(){
		return saldo;
	}

}

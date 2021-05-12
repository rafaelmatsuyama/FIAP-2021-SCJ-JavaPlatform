package ex06;

public class ContaBancaria {

	// atributos
	private String titular;
	private double saldo;

	// métodos
	public void saque(double valor){
		saldo -= valor;
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	
	// getters / setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo(){
		return saldo;
	}

}

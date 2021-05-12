package ex05;

public class ContaBancaria {

	// atributos
	private String titular;
	private double saldo;
	private static int identificador;

	//construtores
	public ContaBancaria(){ // construtor sem argumentos
		ContaBancaria.identificador++; // incrementa variável estática
	}

	public ContaBancaria(String titular){ // construtor passando titular
	    this(); // chama o construtor padrão
	    this.titular = titular;
	}

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
	
	public static int getIdentificador() {
		return identificador;
	}

}

package ex02;

public class ContaBancaria {

	protected double saldo;
	private double taxaBancaria1Dia=1;
	
	public double getTaxaBancaria(){
		return getTaxaBancaria(1);
	}

	public double getTaxaBancaria(int dias){
		return getTaxaBancaria(dias, 0);
	}
	
	public double getTaxaBancaria(int dias, int meses){
		return taxaBancaria1Dia*dias + taxaBancaria1Dia*30*meses;
	}
	
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

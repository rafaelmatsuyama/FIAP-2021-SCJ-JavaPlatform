package ex04;

import java.time.LocalDate;

public class ContaBancaria {

	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	protected LocalDate dataNascimento;
	protected LocalDate dataRegistro;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente,LocalDate dataNascimento,
			LocalDate dataRegistro) {
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
		this.dataNascimento = dataNascimento;
		this.dataRegistro = dataRegistro;
	}
	
	public ContaBancaria(String nomeCliente, String cpfCliente,LocalDate dataNascimento,
			LocalDate dataRegistro) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.dataNascimento = dataNascimento;
		this.dataRegistro = dataRegistro;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void saque(double valor) {
		
	}
	
	public void deposita(double valor){
		saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}

}

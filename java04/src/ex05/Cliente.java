package ex05;

import java.time.LocalDateTime;

public class Cliente {
	
	private String nome;
	private int idade;
	boolean ativo;
	LocalDateTime dataUltimaCompra;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDateTime getDataUltimaCompra() {
		return dataUltimaCompra;
	}
	public void setDataUltimaCompra(LocalDateTime dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", ativo=" + ativo + ", dataUltimaCompra="
				+ dataUltimaCompra + "]";
	}
	public Cliente(String nome, int idade, boolean ativo, LocalDateTime dataUltimaCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.ativo = ativo;
		this.dataUltimaCompra = dataUltimaCompra;
	}
	
	

}

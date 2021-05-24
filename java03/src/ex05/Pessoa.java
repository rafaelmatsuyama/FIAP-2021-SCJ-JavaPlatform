package ex05;

public class Pessoa implements Cloneable{
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	 public Pessoa clone() throws CloneNotSupportedException{  
         return (Pessoa) super.clone();  
  }  
	

}

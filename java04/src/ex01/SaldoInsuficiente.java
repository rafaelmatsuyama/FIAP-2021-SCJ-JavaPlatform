package ex01;

@SuppressWarnings("serial")
public class SaldoInsuficiente extends Exception {
	
	public SaldoInsuficiente(String mensagem){
		super(mensagem);
	}

}

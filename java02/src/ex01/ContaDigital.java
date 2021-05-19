package ex01;

public class ContaDigital extends ContaBancaria {
	
	@Override
	public void saque(double valor){
		if(saldo > 0) {
			saldo -= valor;
		}
	}
}

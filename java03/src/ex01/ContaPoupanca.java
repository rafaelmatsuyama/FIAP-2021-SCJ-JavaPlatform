package ex01;
public class ContaPoupanca extends ContaBancaria {
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	public void saque(double valor) throws SaldoInsuficiente{
		
		if (saldo - (valor - 0.10) < 0){
			throw new SaldoInsuficiente("Saldo Insuficiente para o Saque.");
		}
		saldo -= valor - 0.10;
	}
	

	public boolean equals(Object obj) {
		ContaPoupanca conta = (ContaPoupanca) obj;
		return (conta.cpfCliente.equals(this.cpfCliente));
	}
}

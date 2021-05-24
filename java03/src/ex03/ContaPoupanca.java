package ex03;
public class ContaPoupanca extends ContaBancaria {
	
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	public void saque(double valor){
		saldo -= valor-0.10;
	}
	

	public boolean equals(Object obj) {
		ContaPoupanca conta= (ContaPoupanca) obj;
		return (conta.cpfCliente.equals(this.cpfCliente));
	}
}

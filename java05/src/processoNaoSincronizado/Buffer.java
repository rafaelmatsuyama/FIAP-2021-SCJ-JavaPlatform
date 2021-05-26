package processoNaoSincronizado;

public class Buffer {
	private int conteudo;
	@SuppressWarnings("unused")
	private boolean disponivel = false;

	public int get() throws Exception {

		System.out.println("Consumidor " + conteudo + ".");
		disponivel = false;

		return conteudo;
	}

	public void put(int valor) throws Exception {

		conteudo = valor;
		System.out.println("Produtor " + valor + ".");
		disponivel = true;

	}
}

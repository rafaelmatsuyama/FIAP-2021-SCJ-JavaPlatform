package processoSincronizado;

public class Buffer {
	private int conteudo;
	private boolean disponivel = false;

	public synchronized int get() throws Exception {
		
		while (!disponivel) {
			wait();
		}

		System.out.println("Consumidor " + conteudo + ".");
		disponivel = false;
		notifyAll();
		return conteudo;
	}

	public synchronized void put(int valor) throws Exception {
		
		while (disponivel) {
			wait();
		}
		conteudo = valor;
		System.out.println("Produtor " + valor + ".");
		disponivel = true;
		notifyAll();
	}
}

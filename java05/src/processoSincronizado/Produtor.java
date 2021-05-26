package processoSincronizado;

public class Produtor extends Thread {
	private Buffer buffer;

	public Produtor(Buffer buffer, int numero) {
		this.buffer = buffer;
	}

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				buffer.put(i);
				sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

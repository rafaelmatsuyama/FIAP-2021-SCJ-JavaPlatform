package ex1;

public class CorridaCavalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cavalo cavalo1 = new Cavalo("Trovão");
		Cavalo cavalo2 = new Cavalo("Malhado");
		Cavalo cavalo3 = new Cavalo("Papai-Noel");
		Cavalo cavalo4 = new Cavalo("Campeão");
		Cavalo cavalo5 = new Cavalo("Bola");
		Cavalo cavalo6 = new Cavalo("Preto");

		Thread thread1 = new Thread(cavalo1);
		Thread thread2 = new Thread(cavalo2);
		Thread thread3 = new Thread(cavalo3);
		Thread thread4 = new Thread(cavalo4);
		Thread thread5 = new Thread(cavalo5);
		Thread thread6 = new Thread(cavalo6);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();

	}

}

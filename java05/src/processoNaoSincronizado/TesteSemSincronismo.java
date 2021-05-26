package processoNaoSincronizado;

public class TesteSemSincronismo {

	public static void main(String[] args) {
		
		Buffer b = new Buffer();
		Produtor p = new Produtor(b, 10);
		p.start();
		Consumidor c = new Consumidor(b, 10);
		c.start();

	}

}

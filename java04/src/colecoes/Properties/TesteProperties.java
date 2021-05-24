package colecoes.Properties;

import java.util.Properties;

public class TesteProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Properties prop = new Properties(System.getProperties());
		prop.setProperty("testando", "1");
		System.out.println("Propriedade testando " + prop.getProperty("testando"));

		/*
		 * Carregar as propriedades do arquivo e salvar no sistema Properties
		 * prop; FileInputStream arquivoPropr = new
		 * FileInputStream("cfg\\GCOREAgente.properties"); prop = new
		 * Properties(System.getProperties()); prop.load(arquivoPropr);
		 * System.setProperties(prop);
		 */

	}

}

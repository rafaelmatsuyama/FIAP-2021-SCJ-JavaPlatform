package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CorridaCavaloEnhanced {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			ExecutorService executor4 = Executors.newWorkStealingPool();
			ExecutorService executor5 = Executors.newWorkStealingPool();

			CavaloEnhanced cavalo1 = new CavaloEnhanced("Trovão");
			CavaloEnhanced cavalo2 = new CavaloEnhanced("Malhado");
			CavaloEnhanced cavalo3 = new CavaloEnhanced("Papai-Noel");
			CavaloEnhanced cavalo4 = new CavaloEnhanced("Campeão");
			CavaloEnhanced cavalo5 = new CavaloEnhanced("Bola");
			CavaloEnhanced cavalo6 = new CavaloEnhanced("Preto");

			List<Callable<String>> callables = Arrays.asList(cavalo1, cavalo2, cavalo3, cavalo4, cavalo5, cavalo6);

			System.out.println("Aguarando somente o vencedor...");
			String resultado = executor5.invokeAny(callables);
			System.out.println("Vencedor: " + resultado);
			
			System.out.println("Aguarando a execução de todos...");
			executor4.invokeAll(callables).stream().map(future -> {
				try {
					return future.get();
				} catch (Exception e) {
					throw new IllegalStateException(e);
				}
			}).forEach(System.out::println);

		
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}

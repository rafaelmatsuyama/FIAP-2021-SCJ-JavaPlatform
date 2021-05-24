package ex03;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {

	public static void main(String[] args) {

		ArrayList<String> lista1 = new ArrayList<>();
		LinkedList<String> lista2 = new LinkedList<>();

		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i <= 100000000; i++) {
			lista1.add("String: " + i);
		}

		LocalDateTime fim = LocalDateTime.now();

		long tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		System.out.println("Tempo de Inser��o [ArrayList]: " + tempoInsercao);

		inicio = LocalDateTime.now();
		for (int i = 1; i <= 100000000; i++) {
			lista2.add("String: " + i);
		}
		fim = LocalDateTime.now();
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		System.out.println("Tempo de Inser��o [LinkedList]: " + tempoInsercao);

		inicio = LocalDateTime.now();
		lista1.get(50000000);
		fim = LocalDateTime.now();
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		System.out.println("Tempo de Consulta [ArrayList]: " + tempoInsercao);

		inicio = LocalDateTime.now();
		lista2.get(50000000);
		fim = LocalDateTime.now();
		tempoInsercao = ChronoUnit.MILLIS.between(inicio, fim);
		System.out.println("Tempo de Consulta [LinkedList]: " + tempoInsercao);

	}

}

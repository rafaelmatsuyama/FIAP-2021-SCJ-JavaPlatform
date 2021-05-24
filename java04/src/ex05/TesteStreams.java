package ex05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

public class TesteStreams {

	public static void main(String[] args) {

		ArrayList<Cliente> listaCliente = new ArrayList<>();
		listaCliente.add(new Cliente("João", 68, true, LocalDateTime.of(2001, 1, 10, 12, 45)));
		listaCliente.add(new Cliente("Henrique", 98, true, LocalDateTime.of(2000, 1, 8, 8, 0)));
		listaCliente.add(new Cliente("José", 87, true, LocalDateTime.of(2012, 12, 5, 9, 22)));
		listaCliente.add(new Cliente("Pedro", 45, true, LocalDateTime.of(2016, 8, 12, 7, 54)));
		listaCliente.add(new Cliente("Paulo", 33, true, LocalDateTime.of(2015, 3, 1, 8, 59)));

		listaCliente.stream()
				.filter(c -> Period.between(c.getDataUltimaCompra().toLocalDate(), LocalDate.now()).getYears() >= 5)
				.forEach(c -> c.setAtivo(false));

		Double mediaIdade = listaCliente.stream().mapToInt(Cliente::getIdade).average().getAsDouble();

		int idadeMaxima = listaCliente.stream().mapToInt(Cliente::getIdade).max().getAsInt();

		int idadeMinima = listaCliente.stream().mapToInt(Cliente::getIdade).min().getAsInt();

		System.out.println(
				"Idade Média: " + mediaIdade + " Idade Máxima: " + idadeMaxima + " Idade Mínima:" + idadeMinima);

		listaCliente.forEach(System.out::println);

	}

}

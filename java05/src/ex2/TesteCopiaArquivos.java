package ex2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TesteCopiaArquivos {

	public static void main(String[] args) {

		try {
			
			Path origem = Paths.get("origem");
			Path destino = Paths.get("destino");
			Files.walkFileTree(origem, new CopiarArquivos(destino));

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

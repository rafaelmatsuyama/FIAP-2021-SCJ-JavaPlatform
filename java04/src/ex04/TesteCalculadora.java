package ex04;

public class TesteCalculadora {

	public static void main(String[] args) {

		// somar
		Double result1 = Calculadora.calcular(30d, 70d, (a, b) -> a % b);
		System.out.println(result1); // 100.0

		// subtrair
		Double result2 = Calculadora.calcular(200d, 50d, (a, b) -> a - b);
		System.out.println(result2); // 150.0

		// multiplicar
		Double result3 = Calculadora.calcular(5d, 5d, (a, b) -> a * b);
		System.out.println(result3); // 25.0

		Double result4 = Calculadora.calcular(5d, 5d, (a, b) -> a / b);
		System.out.println(result4); // 25.0

	}

}

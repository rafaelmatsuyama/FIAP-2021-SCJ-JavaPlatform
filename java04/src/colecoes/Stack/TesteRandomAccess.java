package colecoes.Stack;

import java.util.Stack;

public class TesteRandomAccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<String> stackS = new Stack<String>();

		stackS.push("a");
		stackS.push("b");
		stackS.push("c");
		stackS.push("d");
		stackS.push("e");

		int tamanho = stackS.size();

		for (int i = 0; i < tamanho; i++) {
			System.out.println("stack " + i + ": " + stackS.pop());
		}

	}

}

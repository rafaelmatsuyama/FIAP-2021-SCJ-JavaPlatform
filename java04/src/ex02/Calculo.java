package ex02;
public class Calculo {

	public static void main(String[] args) {

		int [] intArray = new int[] {3, 5, 1, 9, 10};
		int soma = 0;
		int max = 0;
		int min = 0;
		float media = 0;
		for (int i = 0; i<intArray.length; i++){
			soma+=intArray[i];
			if (i == 0){
				min = intArray[i];
				max = intArray[i];	
			}
			if (intArray[i]>max){
				max = intArray[i];
			}
			if (intArray[i]<min){
				min = intArray[i];
			}
		}
		media = (float) soma/(float) intArray.length;
		
		System.out.println("Soma "+soma);
		System.out.println("Maximo "+max);
		System.out.println("Minimo "+min);
		System.out.println("Media "+media);

	}
}
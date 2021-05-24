package ex05;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("João");
		System.out.println("Hash p1:"+p1);
		
		try {
			
			Pessoa p2  = p1.clone();
			System.out.println("Hash p2:"+p2);
			p2.setNome("Marta");
			System.out.println("Nome p2:"+p2.getNome());
			System.out.println("Nome p1:"+p1.getNome());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}

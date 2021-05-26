package ex1;

public class Cavalo implements Runnable{
	
	String nomeCavalo;
	
	
	
	public Cavalo(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}

	public void run(){
		try{
			for (int i=1;i<11;i++){
				Thread.sleep((int)(Math.random() * 5000));
				System.out.println(nomeCavalo+" "+i*100/10+"% percorridos...");
			}
			System.out.println("========"+nomeCavalo+" cruza linha de chegada! ========");
		}
		catch (Exception e){
			
		}
		
	}

}

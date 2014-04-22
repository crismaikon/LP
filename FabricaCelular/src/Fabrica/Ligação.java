package Fabrica;

public class Ligação {
	
	private boolean ligação;
	
	public void setLigação(boolean ligação){
		this.ligação = ligação;
	}
	
	public boolean getLigação(){
		return ligação;
	}
	
	public String Ligar(String numero){
		if(ligação == true){
			return "Ligando para " + numero;
		}
		return "Ligação não ativada no aparelho";
	}
	
	

}

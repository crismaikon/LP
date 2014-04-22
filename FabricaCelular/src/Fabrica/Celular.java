package Fabrica;

public class Celular {

	private Ligação ligação;
	private Mensagem mensagem;
	private Relogio relogio;
	
	public Celular(Ligação ligação, Mensagem mensagem, Relogio relogio){
		
		this.ligação = ligação;
		this.mensagem = mensagem;
		this.relogio = relogio;
		
	}

	//Get e Set
	public Ligação getLigação() {
		return ligação;
	}
	public void setLigação(Ligação ligação) {
		this.ligação = ligação;
	}
	public Mensagem getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	public Relogio getRelogio() {
		return relogio;
	}
	public void setRelogio(Relogio relogio) {
		this.relogio = relogio;
	}

}

package LinhaProdução;

public class Funcionalidade {
	
	private boolean ligação;
	private boolean mensagem;
	private boolean despertador;

	public Funcionalidade(boolean ligação, boolean mensagem, boolean despertador) {
		super();
		this.ligação = ligação;
		this.mensagem = mensagem;
		this.despertador = despertador;
	}

	public boolean isLigação() {
		return ligação;
	}

	public void setLigação(boolean ligação) {
		this.ligação = ligação;
	}

	public boolean isMensagem() {
		return mensagem;
	}

	public void setMensagem(boolean mensagem) {
		this.mensagem = mensagem;
	}

	public boolean isDespertador() {
		return despertador;
	}

	public void setDespertador(boolean despertador) {
		this.despertador = despertador;
	}
	
	
	

	
	

}

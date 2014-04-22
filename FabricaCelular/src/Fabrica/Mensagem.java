package Fabrica;

public class Mensagem {
	
	private boolean mensagem;


	public boolean MandarMensagem(boolean mensagem) {
		return mensagem;

	}
	
	//try
	public String EnviarMensagem(String mensagemTexto, String numero) {
		
		if (mensagemTexto != null && numero != null && mensagem == true){
			return "Enviada para "+numero;
		}
		
		return "Erro";
	}

	public boolean getMandarMensagem() {
		return mensagem;
	}
	
	public boolean getMensagem() {
		return mensagem;
	}

	public void setMensagem(boolean mensagem) {
		this.mensagem = mensagem;
	}


}

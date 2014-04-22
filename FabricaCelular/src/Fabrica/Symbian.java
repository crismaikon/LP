package Fabrica;

public class Symbian extends Celular implements Smartphone {

	private Modelo modelo;
	private boolean video;
	private boolean musica;

	public Symbian(Modelo modelo, Ligação ligação, Mensagem mensagem,
			Relogio relogio) {

		super(ligação, mensagem, relogio);
		this.modelo = modelo;

	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	// Interface
	public String Videos(String nomeVideo) {
		if (video == true) {
			return nomeVideo;
		}

		return ("Não Possui");
	}

	public String PlayerDeMusica(String nomePlayer) {
		
		if (musica == true) {
			return nomePlayer;
		}

		return "Não Possui";
	}

	public String Wifi(boolean funciona) {

		if (funciona == true) {
			return "Possui";
		}

		return "Não Possui";
	}

	public String VersaoSo(String versão) {
		return versão;

	}

	public String InstalarAplicativos(String extenção) {
		if (extenção == "JAR" || extenção == "jar"){
			return "Pode instalar";
		}
		
		return "Não pode instalar";

	}

	public String ConexãoInternet(String conexão) {
		return conexão;

	}

	public void Video(boolean video) {
		this.video = video;
	}

	public void Musica(boolean musica) {
		this.musica = musica;
	}

}

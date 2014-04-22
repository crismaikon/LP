package Fabrica;

public class Android extends Celular implements
		Smartphone {

	private Modelo modelo;
	private boolean googleApps;
	private boolean video;
	private boolean musica;

	public Android(boolean googleApps, Modelo modelo,Ligação ligação, Mensagem mensage, Relogio relogio) {
		super(ligação, mensage, relogio);
		this.googleApps = googleApps;
		this.modelo = modelo;

	}

	public boolean getGoogleApps() {
		return googleApps;
	}

	public void setGoogleApps(boolean googleApps) {
		this.googleApps = googleApps;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	// Interface
	public String wifi(boolean funciona) {
		String f = "Não tem";

		if (funciona == true) {
			f = "Tem";
		}

		return f;
	}

	public String versaoSo(String versão) {
		return versão;

	}

	public String extençãoAplicativos(String extenção) {
		return extenção;

	}

	public String conexãoInternet(String conexão) {
		return conexão;

	}
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
		if (extenção == "APK" || extenção == "apk" && googleApps == true){
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
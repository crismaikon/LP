package LinhaProdução;


public class Android {
	
	
	private Modelo[] modelos;
	private String versãoDoSO;
	private boolean wifi;
	private boolean aplicativosGoogle;
	private boolean videos;
	private boolean playerDeMusica;
	private double preço;
	private int quantidadeModelo;

	public Android(int quantidadeModelo, String versãoDoSO, boolean wifi, boolean aplicativosGoogle, boolean videos, boolean playerDeMusica, double preço) {
		
		this.versãoDoSO = versãoDoSO;
		this.wifi = wifi;
		this.aplicativosGoogle = aplicativosGoogle;
		this.videos = videos;
		this.playerDeMusica = playerDeMusica;
		this.preço = preço;
		
		modelos = new Modelo[quantidadeModelo];
	}
	
	public Modelo[] getModelos() {
		return modelos;
	}

	public void setModelos(Modelo[] modelos) {
		this.modelos = modelos;
	}

	public String getVersãoDoSO() {
		return versãoDoSO;
	}

	public void setVersãoDoSO(String versãoDoSO) {
		this.versãoDoSO = versãoDoSO;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isAplicativosGoogle() {
		return aplicativosGoogle;
	}

	public void setAplicativosGoogle(boolean aplicativosGoogle) {
		this.aplicativosGoogle = aplicativosGoogle;
	}

	public boolean isVideos() {
		return videos;
	}

	public void setVideos(boolean videos) {
		this.videos = videos;
	}

	public boolean isPlayerDeMusica() {
		return playerDeMusica;
	}

	public void setPlayerDeMusica(boolean playerDeMusica) {
		this.playerDeMusica = playerDeMusica;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidadeModelo() {
		return quantidadeModelo;
	}

	public void setQuantidadeModelo(int quantidadeModelo) {
		this.quantidadeModelo = quantidadeModelo;
	}


}

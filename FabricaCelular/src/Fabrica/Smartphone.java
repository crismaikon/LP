package Fabrica;

public interface Smartphone {

	public String Videos(String nomeVideo);

	public String PlayerDeMusica(String nomePlayer);

	public String VersaoSo(String versão);

	public String InstalarAplicativos(String extenção);

	public String ConexãoInternet(String conexão);
	
	public String Wifi(boolean funciona);
	
	public void Video(boolean video);
	
	public void Musica(boolean musica);
	
}
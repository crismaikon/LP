package LinhaProdução;


public class Android {
	
	
	private Modelo[] modelos;
	private String versãoDoSO;
	private boolean googleApps;
	private double preço;
	private int quantidadeModelo;

	public Android(int quantidadeModelo, String versãoDoSO, boolean googleApps, double preço) {
		
		this.versãoDoSO = versãoDoSO;
		this.googleApps = googleApps;
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

	public boolean isGoogleApps() {
		return googleApps;
	}

	public void setGoogleApps(boolean googleApps) {
		this.googleApps = googleApps;
	}
	
	


}

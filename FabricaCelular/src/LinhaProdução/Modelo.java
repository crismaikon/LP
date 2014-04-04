package LinhaProdução;

public class Modelo {
	
	private String nome;
	private double preço;
	private String dataFabricação;
	private int quantProduzida;
	private int serial;
	
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getDataFabricação() {
		return dataFabricação;
	}
	public void setDataFabricação(String dataFabricação) {
		this.dataFabricação = dataFabricação;
	}
	public int getQuantProduzida() {
		return quantProduzida;
	}
	public void setQuantProduzida(int quantProduzida) {
		this.quantProduzida = quantProduzida;
	}

}

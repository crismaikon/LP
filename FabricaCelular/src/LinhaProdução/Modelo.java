package LinhaProdução;

public class Modelo {
	
	private String modeloNome;
	private double preço;
	private String dataFabricação;
	private int quantProduzida;
	private String serial;
	
	public Modelo ( String modeloNome, double preço, String dataFabricação, int quantProduzida, String serial){
		
		this.modeloNome = modeloNome;
		this.preço = preço;
		this.dataFabricação = dataFabricação;
		this.quantProduzida = quantProduzida;
		this.serial = serial;
		
	}
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getmodeloNome() {
		return modeloNome;
	}
	public void setmodeloNome(String modeloNome) {
		this.modeloNome = modeloNome;
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

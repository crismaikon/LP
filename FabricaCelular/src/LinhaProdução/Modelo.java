package LinhaProdução;

public class Modelo {
	
	private String modeloNome;
	private String dataFabricação;
	private int quantProduzida;
	private String serial;
	
	
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

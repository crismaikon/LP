package Fabrica;


public class Relogio {
	private boolean despertador;
	

	public boolean Dispertador(boolean funciona) {
		despertador = funciona;
		return despertador;

	}
	
	public boolean equals(Relogio relogio){
		if(this.despertador == relogio.getDespertador()){
			return true;
		}
		return false;
	}

	public boolean getDespertador() {
		return despertador;
	}

	public void setDespertador(boolean despertador) {
		this.despertador = despertador;
	}

	public String Dispertar(String data, String hora) {
		if (despertador == true && data != null && hora != null){
			return "Programado para "+hora+" - "+data;
			
		}
		
		return "Não Programado";
	}

}

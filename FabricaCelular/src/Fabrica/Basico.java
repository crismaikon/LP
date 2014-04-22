package Fabrica;

public class Basico extends Celular {

	private Modelo modelo;

	public Basico(Modelo modelo, Ligação ligação, Mensagem mensagem,
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
}

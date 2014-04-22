package Fabrica;

public class Funcionario extends Pessoa {

	private String cargo;
	private String tempoServiço;
	private double salario;

	public Funcionario(String cargo, String tempoServiço, double salario) {

		this.cargo = cargo;
		this.tempoServiço = tempoServiço;
		this.salario = salario;

	}

	public String getCargo() {
		return cargo;
	}

	public String getTempoServiço() {
		return tempoServiço;
	}

	public double getSalario() {
		return salario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setTempoServiço(String tempoServiço) {
		this.tempoServiço = tempoServiço;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

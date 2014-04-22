package Fabrica;

public class Pessoa {

	public  DadosPessoal dadosPessoais;
	public Endereço endereços;

	public DadosPessoal getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoal dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public Endereço getEndereços() {
		return endereços;
	}

	public void setEndereços(Endereço endereços) {
		this.endereços = endereços;
	}

}
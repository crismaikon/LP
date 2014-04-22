package Fabrica;

public class DadosPessoal {
	private String nome;
	private String cpf;
	private int rg;
	private int carteiraTrabalho;
	private String telefone;
	private String dataNascimento;

	public DadosPessoal() {
		this(null, null, 0, 0, null, null);
	}

	public DadosPessoal(String nome, String cpf, int rg, int carteiraTrabalho,
			String telefone, String dataNascimento) {

		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.carteiraTrabalho = carteiraTrabalho;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getRg() {
		return rg;
	}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}

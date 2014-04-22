package Fabrica;

public interface TratamentoFuncionario {
	
	
	void cadastrarFuncionçrio(Funcionario novoFuncionçrio);
	void demiteFuncionçrio(String nomeFuncionario);
	boolean testaDemitido(Funcionario funcionarioI);
	void mudaCargo(String nomeDoFuncinario, String novoCargo);
	void aumentaSalçrio(String nomeDoFuncinario, double novoSalario);

}

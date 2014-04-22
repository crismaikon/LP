package Fabrica;

public class GerenciamentoFuncionario implements TratamentoFuncionario {

	private Funcionario[] funcionarios;
	private int contadorFuncionçrios;
	
	public GerenciamentoFuncionario(int numFuncionarios){
	    funcionarios = new Funcionario[numFuncionarios];
	    contadorFuncionçrios = 0;
	   }

	public void cadastrarFuncionçrio(Funcionario novoFuncionçrio) {

		for (Funcionario funcionçrioAntigo : funcionarios) {

			if ((funcionçrioAntigo != null)
					&& (funcionçrioAntigo.dadosPessoais.getCpf() == novoFuncionçrio.dadosPessoais
							.getCpf())) {
				System.out
						.println("Funcionçrio Nço Castrado! O CPF Jç Existe no Sistema! ");
				return;
			}

		}
		funcionarios[contadorFuncionçrios++] = novoFuncionçrio;
	}
	
	public void demiteFuncionçrio(String nomeFuncionario) {
		for(int i = 0; i<funcionarios.length; i++  ){
			if(funcionarios[i] != null){
				if(funcionarios[i].getDadosPessoais().getNome() == nomeFuncionario){
					funcionarios[i] = null;
					if(funcionarios[i]==null){
						System.out.println("O Funcionçrio Foi Demitido");
						
					}
				}
			}
		}
	}
	
	
	public boolean testaDemitido(Funcionario funcionarioI) {

		boolean demitido = true;

		for (Funcionario funcionario : funcionarios) {

			if (funcionarioI == funcionario) {
				demitido = false;
			}
		}
		
		if(demitido==true){
			System.out.println("Demitido");
			
		}else{
			System.out.println("Nço Demitido");
		}
		return demitido;
	}

	public void mudaCargo(String nomeDoFuncinario, String novoCargo) {

		for (Funcionario nomeFuncionario : funcionarios) {

			if (nomeDoFuncinario == nomeFuncionario.dadosPessoais.getNome()) {

				nomeFuncionario.setCargo(novoCargo);
				System.out.println("O Cargo de " + nomeDoFuncinario
						+ " Foi Alterado Para  " + nomeFuncionario.getCargo());
				return;
			}
		}

	}

	public void aumentaSalçrio(String nomeDoFuncinario, double novoSalario) {

		for (Funcionario nomeFuncionario : funcionarios) {

			if (nomeDoFuncinario == nomeFuncionario.dadosPessoais.getNome()) {

				nomeFuncionario.setSalario(novoSalario);
				System.out
						.println("O Salçrio de " + nomeDoFuncinario
								+ " Foi Alterado Para  "
								+ nomeFuncionario.getSalario());
				return;
			}
		}
	}
}

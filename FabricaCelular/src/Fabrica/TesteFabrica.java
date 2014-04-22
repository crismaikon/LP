package Fabrica;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TesteFabrica {
	Modelo m;
	Mensagem mensagem;
	Relogio relogio;
	Ligação ligação;
	Android android;
	Symbian symbian;
	Basico basico;
	LinhaDeMontagem linha;
	Celular nomeCelular;
	Smartphone nomeSmarthPhone;

	@Before
	public void CriarModelo() {
		LinhaDeMontagem.setconadores();

		m = new Modelo();
		m.setSerial("B453.N63BH-289");
		m.setmodeloNome("L3");
		m.setDataFabricação("14/30/2014");

		relogio = new Relogio();
		relogio.Dispertador(true);
		relogio.Dispertar("14/03/2014", "18:00");

		mensagem = new Mensagem();
		mensagem.MandarMensagem(true);
		mensagem.EnviarMensagem("Bom dia", "(83) 9102-3957");

		ligação = new Ligação();
		ligação.setLigação(true);
		ligação.Ligar("(83)9376-3282");

		linha = new LinhaDeMontagem(1000, 1200, 2000);
		linha.adicionarAndroid(android);
		linha.adicionarSymbian(symbian);
		linha.adicionarBasico(basico);

	}

	@Test
	public void TestaModelo() {
		assertEquals("B453.N63BH-289", m.getSerial());
		assertEquals("L3", m.getmodeloNome());
		assertEquals("14/30/2014", m.getDataFabricação());
	}

	public void TesteCelular(Celular nomeCelular) {
		assertEquals(ligação, nomeCelular.getLigação());
		assertEquals(mensagem, nomeCelular.getMensagem());
		assertEquals(relogio, nomeCelular.getRelogio());

		nomeCelular.getRelogio().Dispertador(true);
		nomeCelular.getMensagem().setMensagem(true);
		nomeCelular.getLigação().setLigação(true);

		assertEquals(true, nomeCelular.getRelogio().getDespertador());
		assertEquals(true, nomeCelular.getMensagem().getMandarMensagem());
		assertEquals(true, nomeCelular.getLigação().getLigação());

		assertEquals("Enviada para (83)9323-3010", nomeCelular.getMensagem()
				.EnviarMensagem("Vamos Jantar", "(83)9323-3010"));
		assertEquals("Ligando para (83)9323-3010", nomeCelular.getLigação()
				.Ligar("(83)9323-3010"));
		assertEquals("Programado para 18:00 - 13/13/13", nomeCelular
				.getRelogio().Dispertar("13/13/13", "18:00"));
	}

	@Test
	public void CriarAndroid() {
		android = new Android(true, m, ligação, mensagem, relogio);
		TesteCelular(android);
		assertEquals(m, android.getModelo());
	}

	@Test
	public void CriarSymbian() {
		symbian = new Symbian(m, ligação, mensagem, relogio);
		TesteCelular(symbian);
		assertEquals(m, symbian.getModelo());
	}

	@Test
	public void CriarBasico() {
		basico = new Basico(m, ligação, mensagem, relogio);
		TesteCelular(basico);
		assertEquals(m, basico.getModelo());
	}

	@Test
	public void TesteLinhaDeMontagem() {
		linha.VeificaNomeExistente("L3");
		linha.VerificarSerialExistente("B234.234N34-2332");
		linha.VerificaMetaAtingida();
	}

	@Test
	public void TestaDadosPessoais() {
		DadosPessoal dadosPes1 = new DadosPessoal("Thiago Gomes",
				"097.765467-88", 1234567, 45678, "3032-2345", "30/07/1988");
		dadosPes1.setCarteiraTrabalho(876245);
		dadosPes1.setCpf("065.345.273-77");
		dadosPes1.setDataNascimento("12/03/2013");
		dadosPes1.setNome("Joço da Silva");
		dadosPes1.setRg(6432148);
		dadosPes1.setTelefone("3222-6745");
		assertEquals(876245, dadosPes1.getCarteiraTrabalho());
		assertEquals("065.345.273-77", dadosPes1.getCpf());
		assertEquals("12/03/2013", dadosPes1.getDataNascimento());
		assertEquals("Joço da Silva", dadosPes1.getNome());
		assertEquals(6432148, dadosPes1.getRg());
		assertEquals("3222-6745", dadosPes1.getTelefone());
	}

	@Test
	public void TestaEndereço() {
		Endereço endereço1 = new Endereço("Rua Joço Cirilo", "Altiplano",
				"Joço Pessoa", "Paraiba", 1078);
		endereço1.setBairro("Campo Grande");
		endereço1.setCidade("Recife");
		endereço1.setEstado("Pernambuco");
		endereço1.setNumero(6599);
		endereço1.setRua("Rua Aurora");
		assertEquals("Campo Grande", endereço1.getBairro());
		assertEquals("Recife", endereço1.getCidade());
		assertEquals("Pernambuco", endereço1.getEstado());
		assertEquals(6599, endereço1.getNumero());
		assertEquals("Rua Aurora", endereço1.getRua());
	}

	@Test
	public void TestaUmaPessoa() {
		DadosPessoal dadosPes1 = new DadosPessoal("Ana Maria",
				"567.657.678-88", 5673456, 45673, "3045-6723", "08/08/08");
		Endereço endereço1 = new Endereço("Rua do Barço", "Centro",
				"Rio Tinto", "Paraiba", 567);
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDadosPessoais(dadosPes1);
		pessoa1.setEndereços(endereço1);
		assertEquals(dadosPes1, pessoa1.getDadosPessoais());
		assertEquals(endereço1, pessoa1.getEndereços());
	}

	@Test
	public void TestaDuasPessoas() {
		DadosPessoal dadosPes1 = new DadosPessoal("Maria do Carmo",
				"567.789.633-00", 456784, 45683, "'3456-7854", "23/04/2000");
		Endereço endereço1 = new Endereço("Rua do Vento", "Bancçrios",
				"Joço Pessoa", "Paraiba", 4363);
		DadosPessoal dadosPes2 = new DadosPessoal("Joço Paulo",
				"346.675.246-77", 5675437, 567349, "2345-6789", "24/12/12");
		Endereço endereço2 = new Endereço("Rua Bom Jesus", "Mangabeira",
				"Joço Pessoa", "Paraiba", 547);
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDadosPessoais(dadosPes1);
		pessoa1.setEndereços(endereço1);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setDadosPessoais(dadosPes2);
		pessoa2.setEndereços(endereço2);
	}

	@Test
	public void TestaNovoFuncionario() {
		DadosPessoal dadosPes1 = new DadosPessoal("Pedro Lima",
				"567.457.247-88", 2345671, 12573, "4567-7678", "31/04/1967");
		Endereço endereço1 = new Endereço("Rua Sço Benedito", "Bessa",
				"Joço Pessoa", "Paraiba", 546);
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDadosPessoais(dadosPes1);
		pessoa1.setEndereços(endereço1);
		Funcionario funciona1 = new Funcionario("Gerente", "2 Anos", 13.000);
		funciona1.setCargo("Fiscal");
		funciona1.setSalario(2.500);
		funciona1.setTempoServiço("1 Ano");
		assertEquals("Fiscal", funciona1.getCargo());
		assertEquals(2.5, funciona1.getSalario(), 0.1);
		assertEquals("1 Ano", funciona1.getTempoServiço());
		funciona1.setDadosPessoais(dadosPes1);
		funciona1.setEndereços(endereço1);
		assertEquals(dadosPes1, funciona1.getDadosPessoais());
		assertEquals(endereço1, funciona1.getEndereços());

	}

	@Test
	public void TestaDoisFuncionçrios() {
		DadosPessoal dadosPes1 = new DadosPessoal("Thais Gomes",
				"567.234.453-77", 2345674, 54672, "3465-7823", "21/09/1990");
		Endereço endereço1 = new Endereço("Rua Guarabira", "Tibiri II",
				"Santa Rita", "Paraiba", 546);
		DadosPessoal dadosPes2 = new DadosPessoal("Junior de Melo",
				"656.678.234-44", 435678, 78653, "6777-7878", "08/09/1977");
		Endereço endereço2 = new Endereço("Rua Cajazeiras", "Castelo Branco",
				"Joço Pessoa", "Paraiba", 12);
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDadosPessoais(dadosPes1);
		pessoa1.setEndereços(endereço1);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setDadosPessoais(dadosPes2);
		pessoa2.setEndereços(endereço2);
		Funcionario funciona1 = new Funcionario("Secretçria", "10 Anos", 999.00);
		funciona1.setDadosPessoais(dadosPes1);
		funciona1.setEndereços(endereço1);
		Funcionario funciona2 = new Funcionario("Gerente", "22 Anos", 1300.00);
		funciona2.setDadosPessoais(dadosPes2);
		funciona2.setEndereços(endereço2);
	}

	@Test
	public void TestaGerenciamentoFuncionçrio() {
		DadosPessoal dadosPes1 = new DadosPessoal("Briam Silva",
				"095.261.414-77", 675423, 56768, "2345-6734", "23/12/1990");
		Endereço endereço1 = new Endereço("Rua Guarabira", "Tibiri II",
				"Santa Rita", "Paraiba", 546);
		DadosPessoal dadosPes2 = new DadosPessoal("Pedro Medeiros",
				"095.261.414-77", 345678, 78563, "3245-6732", "22/08/1966");
		Endereço endereço2 = new Endereço("Rua Cajazeiras", "Castelo Branco",
				"Joço Pessoa", "Paraiba", 12);
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setDadosPessoais(dadosPes1);
		pessoa1.setEndereços(endereço1);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setDadosPessoais(dadosPes2);
		pessoa2.setEndereços(endereço2);
		Funcionario funciona1 = new Funcionario("Desenvolvedor", "2 Anos",
				2000.00);
		funciona1.setDadosPessoais(dadosPes1);
		funciona1.setEndereços(endereço1);
		Funcionario funciona2 = new Funcionario("Montador", "5 Anos", 1500.00);
		funciona2.setDadosPessoais(dadosPes2);
		funciona2.setEndereços(endereço2);
		GerenciamentoFuncionario gerencia1 = new GerenciamentoFuncionario(20);
		gerencia1.cadastrarFuncionçrio(funciona1);
		gerencia1.cadastrarFuncionçrio(funciona2);
		gerencia1.mudaCargo("Briam Silva", "Gerente");
		gerencia1.aumentaSalçrio("Briam Silva", 13000.00);
		gerencia1.demiteFuncionçrio("Briam Silva");
		gerencia1.testaDemitido(funciona1);

	}

}

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
		
		assertEquals("Enviada para (83)9323-3010", nomeCelular.getMensagem().EnviarMensagem("Vamos Jantar", "(83)9323-3010"));
		assertEquals("Ligando para (83)9323-3010", nomeCelular.getLigação().Ligar("(83)9323-3010"));
		assertEquals("Programado para 18:00 - 13/13/13", nomeCelular.getRelogio().Dispertar("13/13/13", "18:00"));
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
	
}

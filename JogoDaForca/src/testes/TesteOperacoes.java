package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controle.Operacoes;

class TesteOperacoes {
	private Operacoes op = new Operacoes();

	@Test
	void testVerificaChute() {
		op.setPalavraEscolhida("WAKANDA");
		op.ocultaPalavra();
		op.verificaChute('A');
		assertEquals(0, op.getNumErros());
		assertEquals(3, op.getNumAcertos());
		
		op.verificaChute('E');
		assertEquals(1, op.getNumErros());
		assertEquals(3, op.getNumAcertos());
	}

	@Test
	void testGetNumErros() {
		assertEquals(0, op.getNumErros());
	}
	
	@Test
	void testGetQtdLetras() {
		op.verificaQtdCharEspeciais("WAKANDA");
		assertEquals(7, op.getQtdLetras());
	}
}

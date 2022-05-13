package br.unicamp.ic.inf335.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class ProdutoBeanTest {

	private ProdutoBean prod = new ProdutoBean();
	
	@Test
	void testCodigo() {
		prod.setCodigo("codigo1");
		String cod = prod.getCodigo();
		assertEquals(cod, (String)"codigo1");
	}
	
	@Test
	void testNome() {
		prod.setNome("nome1");
		String nome = prod.getNome();
		assertEquals(nome, (String)"nome1");
	}	
	
	@Test
	void testDescricao() {
		prod.setDescricao("descricao1");
		String desc = prod.getDescricao();
		assertEquals(desc, (String)"descricao1");
	}
	
	@Test
	void testValor() {
		prod.setValor(49.99);
		Double valor = prod.getValor();
		assertEquals(valor, (Double)49.99);
	}
	
	@Test
	void testEstado() {
		prod.setEstado("estado1");
		String estado = prod.getEstado();
		assertEquals(estado, (String)"estado1");
	}
	
	@Test
	void testCompareTo() {
		ProdutoBean compare = new ProdutoBean();
		compare.setValor(39.99);
		int valor = prod.compareTo(compare);
		assertEquals(valor, (int)-1);
	}
	
}
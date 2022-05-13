package br.unicamp.ic.inf335.app;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.app.ProdutoBean;

class AnuncioBeanTest {
	
	ProdutoBean prod = new ProdutoBean("codigo1","nome1","descricao1",100.00,"estado1");
	AnuncioBean anuncio = new AnuncioBean();
	
	@Test
	void testAddProduto() {
		AnuncioBean anuncio1 = new AnuncioBean();
		ProdutoBean prod1 = new ProdutoBean();
		anuncio1.setProduto(prod);
		prod1 = anuncio1.getProduto();
		assertEquals(prod, prod1);
		
	}
	
	@Test
	void testFotosURL() {
		ArrayList<URL> url = null;
		ArrayList<URL> url2;
		anuncio.setFotosUrl(url);
		url2 = anuncio.getFotosUrl();
		assertEquals(url, url2);
		
	}
	
	@Test
	void testDescontos() {
		double desconto;
		anuncio.setDesconto(0.1);
		desconto = anuncio.getDesconto();
		assertEquals(desconto,(double)0.1);
	}
	
	
	@Test
	void testDesconto() {
		anuncio.setProduto(prod);
		anuncio.setFotosUrl(null);
		anuncio.setDesconto(0.1);
		double valorFinal = anuncio.getValor();
		assertEquals(valorFinal,(double)90.00);
		
		
		
	}

	

}
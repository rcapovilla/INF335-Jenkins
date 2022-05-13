package br.unicamp.ic.inf335.app;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.app.ProdutoBean;

class AnuncianteBeanTest {

	ProdutoBean produto = new ProdutoBean();
	AnuncioBean anuncio = new AnuncioBean();
	AnuncianteBean anunciante = new AnuncianteBean();
	private ArrayList<AnuncioBean> anuncios;
	
	@Test
	void testNome() {
		anunciante.setNome("Anunciante1");
		String nome = anunciante.getNome();
		assertEquals(nome,(String)"Anunciante1");
	}
	
	@Test
	void testCPF() {
		anunciante.setCPF("123456789-00");
		String cpf = anunciante.getCPF();
		assertEquals(cpf,(String)"123456789-00");
	}
	
	@Test
	void testAnuncios() {
		anunciante.setAnuncios(anuncios);
		ArrayList<AnuncioBean> teste1;
		teste1 = anunciante.getAnuncios();
		assertEquals(teste1,anuncios);
		}
	
	@Test
	void testAddAnuncios() {
		ProdutoBean produto1 = new ProdutoBean("codigo1","nome1","descricao1",100.00,"estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2","nome2","descricao2",120.00,"estado2");
		ProdutoBean produto3 = new ProdutoBean("codigo3","nome3","descricao3",80.00,"estado3");
		ArrayList<URL> url1 = null;
		ArrayList<URL> url2 = null;
		ArrayList<URL> url3 = null;
		
		AnuncioBean anuncio1 = new AnuncioBean(produto1,url1,0.1);
		AnuncioBean anuncio2 = new AnuncioBean(produto2,url2,0.15);
		AnuncioBean anuncio3 = new AnuncioBean(produto3,url3,0.08);
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		anunciante.addAnuncio(anuncio3);
		
		int i = anunciante.getAnuncios().size();
		
		assertEquals(i,(int)3);
		
		
	}
	
	@Test
	void testRemoveAnuncios() {
		ProdutoBean produto1 = new ProdutoBean("codigo1","nome1","descricao1",100.00,"estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2","nome2","descricao2",120.00,"estado2");
		ProdutoBean produto3 = new ProdutoBean("codigo3","nome3","descricao3",80.00,"estado3");
		ArrayList<URL> url1 = null;
		ArrayList<URL> url2 = null;
		ArrayList<URL> url3 = null;
		
		AnuncioBean anuncio1 = new AnuncioBean(produto1,url1,0.1);
		AnuncioBean anuncio2 = new AnuncioBean(produto2,url2,0.15);
		AnuncioBean anuncio3 = new AnuncioBean(produto3,url3,0.08);
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		anunciante.addAnuncio(anuncio3);
		
		anunciante.removeAnuncio(1);
		int i = anunciante.getAnuncios().size();
		
		assertEquals(i,(int)2);
	}
	
	@Test
	void testMediaAnuncios() {
		ProdutoBean produto1 = new ProdutoBean("codigo1","nome1","descricao1",100.00,"estado1");
		ProdutoBean produto2 = new ProdutoBean("codigo2","nome2","descricao2",120.00,"estado2");
		ProdutoBean produto3 = new ProdutoBean("codigo3","nome3","descricao3",80.00,"estado3");
		ArrayList<URL> url1 = null;
		ArrayList<URL> url2 = null;
		ArrayList<URL> url3 = null;
		
		AnuncioBean anuncio1 = new AnuncioBean(produto1,url1,0.0);
		AnuncioBean anuncio2 = new AnuncioBean(produto2,url2,0.0);
		AnuncioBean anuncio3 = new AnuncioBean(produto3,url3,0.0);
		
		anunciante.addAnuncio(anuncio1);
		anunciante.addAnuncio(anuncio2);
		anunciante.addAnuncio(anuncio3);
		
		double a = anunciante.valorMedioAnuncios();
		
		assertEquals(a,(double)100.00);
	}
	
	

}
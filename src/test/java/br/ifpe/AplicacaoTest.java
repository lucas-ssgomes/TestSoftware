package br.ifpe;

import org.junit.Assert;
import org.junit.Test;

public class AplicacaoTest {
	
	@Test
	public void test1() {
		
		//Cenario
		Aplicacao app = new Aplicacao();
		
		//A��o
		String valor = app.acao();
			
		//Verifica��o
		Assert.assertTrue(valor == "Exemplo");
	}

}

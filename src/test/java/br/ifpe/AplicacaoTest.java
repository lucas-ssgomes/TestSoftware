package br.ifpe;

import org.junit.Assert;
import org.junit.Test;

public class AplicacaoTest {
	
	@Test
	public void test1() {
		
		//Cenario
		Aplicacao app = new Aplicacao();
		
		//Ação
		String valor = app.acao();
			
		//Verificação
		Assert.assertTrue(valor == "Exemplo");
	}

}

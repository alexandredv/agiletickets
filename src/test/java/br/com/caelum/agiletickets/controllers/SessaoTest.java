package br.com.caelum.agiletickets.controllers;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.agiletickets.models.Sessao;

public class SessaoTest {

	private Sessao sessao;
	
	@Before
	public void inicializa(){
		this.sessao = new Sessao();
		sessao.setTotalIngressos(8);
		System.out.println("A anotacao @Before é chamada antes dos demais");
	}
	/**
	 * @param args
	 */
	@Test
	public void deveTestarAReservaDoTotalDisponivel() {
		Assert.assertEquals(true, this.sessao.podeReservar(8));
	}

}

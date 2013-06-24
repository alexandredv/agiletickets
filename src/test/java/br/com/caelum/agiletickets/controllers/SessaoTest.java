package br.com.caelum.agiletickets.controllers;

import junit.framework.Assert;

import org.junit.Test;

import br.com.caelum.agiletickets.models.Sessao;

public class SessaoTest {

	/**
	 * @param args
	 */
	@Test
	public void reservaTotalDisponivel() {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(8);
		Assert.assertEquals(true, sessao.podeReservar(8));
	}

}

package br.com.caelum.agiletickets.models;

import junit.framework.Assert;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class CriaSessaoTest {

	private LocalDate inicio;
	private LocalDate fim;
	private int periodicidade = 1;
	private Espetaculo espetaculo = new Espetaculo();
	
	@Before
	public void inicializa(){
		inicio = new LocalDate();
		espetaculo = new Espetaculo();
	}
	
	@Test
	public void deveRetornarNenhumaSessao(){
		inicio = null;
		fim = null;
		Assert.assertEquals(0, this.espetaculo.getSessoesNoPeriodo(inicio,fim,periodicidade));
	}
	
	@Test 
	public void deveRetornarUmaSessao(){
		fim = inicio;
		Assert.assertEquals(1, this.espetaculo.getSessoesNoPeriodo(inicio,fim,periodicidade));		
	}

	@Test
	public void deveRetornarNumeroIndeterminadoDeSessoesConsiderandoPeriodicidadeDiaria(){
		Assert.assertEquals(4, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(4), periodicidade));
		Assert.assertEquals(7, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(7), periodicidade));
		Assert.assertEquals(10, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(10), periodicidade));
	}
	
	@Test
	public void deveRetornarNumeroIndeterminadoDeSessoesConsiderandoPeriodicidadeSemanal(){
		periodicidade = 7;
		Assert.assertEquals(1, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(4), periodicidade));
		Assert.assertEquals(2, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(7), periodicidade));
		Assert.assertEquals(2, this.espetaculo.getSessoesNoPeriodo(inicio, inicio.plusDays(10), periodicidade));
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFim() {
		return fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

	public int getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	public Espetaculo getEspetaculo() {
		return espetaculo;
	}

	public void setEspetaculo(Espetaculo espetaculo) {
		this.espetaculo = espetaculo;
	}
	
	
}

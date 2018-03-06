package br.com.fiap.models;

import java.util.Date;

public class Cotacao {
	private String nome;
	private String produto;
	private double valor;
	private Date dataInicio;
	private Date dataFim;

	public Cotacao() {
	}

	public Cotacao(String nome, String produto, double valor, Date dataInicio, Date dataFim) {
		this.nome = nome;
		this.produto = produto;
		this.valor = valor;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}

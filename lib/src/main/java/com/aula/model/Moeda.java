package com.aula.model;

public class Moeda {
	private int id, id_cliente;
	private String nome;
	private double preco_atual, maior_preco, menor_preco, preco_medio;
	
	public Moeda(int id, int id_cliente, String nome, double preco_atual, double maior_preco, double menor_preco,
			double preco_medio) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.preco_atual = preco_atual;
		this.maior_preco = maior_preco;
		this.menor_preco = menor_preco;
		this.preco_medio = preco_medio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco_atual() {
		return preco_atual;
	}

	public void setPreco_atual(double preco_atual) {
		this.preco_atual = preco_atual;
	}

	public double getMaior_preco() {
		return maior_preco;
	}

	public void setMaior_preco(double maior_preco) {
		this.maior_preco = maior_preco;
	}

	public double getMenor_preco() {
		return menor_preco;
	}

	public void setMenor_preco(double menor_preco) {
		this.menor_preco = menor_preco;
	}

	public double getPreco_medio() {
		return preco_medio;
	}

	public void setPreco_medio(double preco_medio) {
		this.preco_medio = preco_medio;
	}
	
	
	
	
}

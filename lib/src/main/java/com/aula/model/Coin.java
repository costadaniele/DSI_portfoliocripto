package com.aula.model;

public class Coin {
	private int id;
	private String url;
	private String symbol;
	private String name;
	
	
	public Coin(int id, String url, String symbol, String name) {
		super();
		this.id = id;
		this.url = url;
		this.symbol = symbol;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
			
}

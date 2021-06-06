package com.aula.model;

public class DataTest {
	private int id;
	private int userId;
	private String title;
	
	
	public DataTest(int id, int userId, String title) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	

}

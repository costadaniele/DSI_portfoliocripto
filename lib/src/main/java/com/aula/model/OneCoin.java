package com.aula.model;

public class OneCoin {
	private String name;
	private String fullname;
	private String openday;
	private String highday;
	private String lowday;
	private String volumedayto;
	private String changeday;
	private String changepctday;
	private String price;
	
	public OneCoin(String name, String fullname, String openday, String highday, String lowday, String volumedayto,
			String changeday, String changepctday, String price) {

		this.name = name;
		this.fullname = fullname;
		this.openday = openday;
		this.highday = highday;
		this.lowday = lowday;
		this.volumedayto = volumedayto;
		this.changeday = changeday;
		this.changepctday = changepctday;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getOpenday() {
		return openday;
	}

	public void setOpenday(String openday) {
		this.openday = openday;
	}

	public String getHighday() {
		return highday;
	}

	public void setHighday(String highday) {
		this.highday = highday;
	}

	public String getLowday() {
		return lowday;
	}

	public void setLowday(String lowday) {
		this.lowday = lowday;
	}

	public String getVolumedayto() {
		return volumedayto;
	}

	public void setVolumedayto(String volumedayto) {
		this.volumedayto = volumedayto;
	}

	public String getChangeday() {
		return changeday;
	}

	public void setChangeday(String changeday) {
		this.changeday = changeday;
	}

	public String getChangepctday() {
		return changepctday;
	}

	public void setChangepctday(String changepctday) {
		this.changepctday = changepctday;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}

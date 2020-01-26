package com.iban.support;

public class NewsLetter {
	
	private String id;
	private String title;
	private String date;
	private String shortDescription;
	
	public NewsLetter(String id, String title, String date, String shortDescription) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.shortDescription = shortDescription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String toStringNewsLetter() {
		
		String info = "TITLE: " + this.title + " DATE: " + this.date + " DESCRIPTION: " + this.shortDescription;
		return info;
	}

}
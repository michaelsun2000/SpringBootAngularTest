package com.test.ws.model;

public class FormattedDate {
	private final long id;
	private final String dateString;
	private final String pattern;
 
	public FormattedDate(final long id, final String pattern, final String dateString) {
		this.id = id;
		this.pattern = pattern;
		this.dateString = dateString;
	}

	public long getId() {
		return id;
	}

	public String getDateString() {
		return dateString;
	}

	public String getPattern() {
		return pattern;
	}
 
	
}

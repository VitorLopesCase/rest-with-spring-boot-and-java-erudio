package br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionsResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Date timestramp;
	private String message;
	private String details;
	

	public ExceptionsResponse(Date timestramp, String message, String details) {
		this.timestramp = timestramp;
		this.message = message;
		this.details = details;
	}


	public Date getTimestramp() {
		return timestramp;
	}


	public void setTimestramp(Date timestramp) {
		this.timestramp = timestramp;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public ExceptionsResponse() {
		
	}
}

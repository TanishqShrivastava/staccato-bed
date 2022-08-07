 package com.staccato.cart.exceptions;

 import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;


 public class CartExceptions {



     private String message;

     public String getMessage() {
		return message;
	}

	public CartExceptions(String message, HttpStatus status, ZonedDateTime zonedDateTime) {
		super();
		this.message = message;
		this.status = status;
		this.zonedDateTime = zonedDateTime;
	}

	@Override
	public String toString() {
		return "CartExceptions [message=" + message + ", status=" + status + ", zonedDateTime=" + zonedDateTime + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}

	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}

	private HttpStatus status;

     private ZonedDateTime zonedDateTime;

 }

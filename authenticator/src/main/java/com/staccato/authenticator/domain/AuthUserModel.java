package com.staccato.authenticator.domain;

import javax.annotation.Generated;
import javax.persistence.Id;

public class AuthUserModel {

	@Id
	private String userId;
	private String usermail;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	public AuthUserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}

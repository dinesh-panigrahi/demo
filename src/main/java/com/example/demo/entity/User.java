package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String paasword;

	@Column(name = "token")
	private String token = null;

	public User() {
		super();
	}

	public User(long id, String userName, String paasword, String token) {
		super();
		this.id = id;
		this.userName = userName;
		this.paasword = paasword;
		this.token = token;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPaasword() {
		return paasword;
	}

	public void setPaasword(String paasword) {
		this.paasword = paasword;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}

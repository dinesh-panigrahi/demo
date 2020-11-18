package com.example.demo.dto;

public class UserDto {

	private long id;

	private String userName;

	private String paasword;

	private String token;

	public UserDto() {
		super();
	}

	public UserDto(long id, String userName, String paasword, String token) {
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

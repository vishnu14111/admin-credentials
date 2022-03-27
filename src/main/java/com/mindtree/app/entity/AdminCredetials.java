package com.mindtree.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdminCredetials {
	
	@Id
	private int id;
	private String email;
	private String password;
	public AdminCredetials(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public AdminCredetials() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

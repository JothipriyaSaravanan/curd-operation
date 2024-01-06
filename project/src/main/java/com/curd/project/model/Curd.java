package com.curd.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curd {

	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String username;
    private Long phone; 
    private String email; 
	
    public Curd(int id, String username, Long phone, String email) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.email = email;
		
	}
	public Curd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}

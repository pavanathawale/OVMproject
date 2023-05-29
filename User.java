package com.online.voting.OVM.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pass;
	private String email;
	private String phonenumber;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String pass, String email, String phonenumber) {
		super();
		this.id = id;
		this.pass = pass;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pass=" + pass + ", email=" + email + ", phonenumber=" + phonenumber + "]";
	}

}

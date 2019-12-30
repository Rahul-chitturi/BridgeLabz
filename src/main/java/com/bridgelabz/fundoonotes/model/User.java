package com.bridgelabz.fundoonotes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@NotNull
	@NotBlank
	private String firstName;

	private String lastName;

	@NotNull
	@Column(unique = true)
	private long mobilenumber;

	@NotNull
	private String password;

	@NotNull 
	@Column(unique = true)
	private String email;

	@Column(name = "created_at")
	public Date createdAt;

	@Column(columnDefinition = "boolean default false")
	private boolean is_email_verified;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User() {

	}

	public User(Long id, String firstName, String lastName, String email, long mobilenumber, String password,
			boolean is_email_verified) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.is_email_verified = is_email_verified;
	}

	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFastName() {
		return lastName;
	}

	public void setFastName(String fastName) {
		this.lastName = fastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isIs_email_verified() {
		return is_email_verified;
	}

	public void setIs_email_verified(boolean is_email_verified) {
		this.is_email_verified = is_email_verified;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt() {
		this.createdAt = new Date();
	}
}
package com.nisha.springboot.thymeleafdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

	// define constructors
	public Employee() {
		
	}

	public Employee(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
	}
	
	// define getters and setters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// define toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ", email=" + email + "]";
	}
}

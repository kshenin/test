package com.kshenin.demo.model;

import java.io.Serializable;

public class EmployeeVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	@Override
	public String toString() {
		return "EmployeeVO{" +
				 "id=" + id +
				 ", firstName='" + firstName + '\'' +
				 ", lastName='" + lastName + '\'' +
				 '}';
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}

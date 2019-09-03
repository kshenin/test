package app.model;

import java.io.Serializable;

public class EmployeeVO implements Serializable {
	public static final long serialVersionUID = 1L;
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	
	public void setId(Integer id) {
		this.id = id;
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
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO:" +
				 "id=" + id +
				 ", firstName='" + firstName + '\'' +
				 ", lastName='" + lastName + '\'' +
				 ", email='" + email + '\'';
	}
}

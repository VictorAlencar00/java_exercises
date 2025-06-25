package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;

	public Client(String name, String email, java.util.Date birthDate2) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + ", ");
		sb.append(email);
		return sb.toString();
	}
	
}

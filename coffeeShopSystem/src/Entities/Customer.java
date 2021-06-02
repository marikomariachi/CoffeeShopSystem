package Entities;

import java.sql.Date;
import java.text.DateFormat;

import Abstract.IEntity;

public class Customer implements IEntity {
	
	int id;
	String firstname;
	String lastname;
	int dateOfBirth;
	long nationalty;
	
	public Customer(int id, String firstname, String lastname, int dateOfBirth, long nationalty) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.nationalty = nationalty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getNationalty() {
		return nationalty;
	}

	public void setNationalty(long nationalty) {
		this.nationalty = nationalty;
	}
	
	
	
}

package com.ps.day4;

public class Participant {
	Participant(){
		
	}
	
	public Participant(String firstName, String lastName, Integer id, String interests) {
		this.firstName = firstName;
		this.firstName = lastName;
		this.id = id;
		this.interests = interests;
	}
	private String firstName, lastName;
	private Integer id;
	private String interests;
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public Integer getId() {
		return this.id;
	}
	public String getInterests() {
		return this.interests;
	}
	
	@Override
	public String toString() {
		return "Participant{" + "First Name='"+firstName+'\''+", Last Name="+ lastName + ", id="+ id + ", interests='"+interests+'\''+'}';
	}

}

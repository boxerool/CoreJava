package com.filefuction.serialize;

public class Student {
	
	private int rollNO;
	private String firstName;
	private String lastName;
	
	public int getRollNO() {
		return rollNO;
	}
	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
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
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

}

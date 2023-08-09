package com.ibm.watsonx.ivr.validateAccountPin.user;

import jakarta.validation.constraints.Size;

public class User {
	private Integer id;
	
	@Size(min=10, max=10, message="phoneNumber must be 10 digits")
	private String phoneNumber;
	
	@Size(min=6, max=6, message="pin must be 6 digits")
	private String pin;

	public User(Integer id,  String phoneNumber, String pin) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.pin = pin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phoneNumber=" + phoneNumber + ", pin=" + pin + "]";
	}
	
}

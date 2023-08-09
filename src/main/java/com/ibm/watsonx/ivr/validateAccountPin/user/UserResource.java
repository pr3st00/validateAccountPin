package com.ibm.watsonx.ivr.validateAccountPin.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;

	public UserResource(UserDaoService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(path="/validate/{pin}") //validate pin
	public boolean validatePin(@PathVariable String pin) {
		boolean isValid = service.validatePin(pin);
		
		return isValid;
	}

}

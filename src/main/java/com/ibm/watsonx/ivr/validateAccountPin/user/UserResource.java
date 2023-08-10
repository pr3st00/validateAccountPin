package com.ibm.watsonx.ivr.validateAccountPin.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserResource {

	private UserDaoService service;

	public UserResource(UserDaoService service) {
		super();
		this.service = service;
	}

	@GetMapping(path = "/validate/{pin}")
	public boolean validatePin(@PathVariable String pin) {
		boolean isValid = service.validatePin(pin);

		if (!isValid) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "pin is invalid");
		}

		return isValid;
	}

}

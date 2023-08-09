package com.ibm.watsonx.ivr.validateAccountPin.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "3038081280", "123456"));
		users.add(new User(++userCount, "3038081281", "123451"));
		users.add(new User(++userCount, "3038081282", "123452"));
	}

	//validate pin
	public boolean validatePin(String pin) {
		Predicate<? super User> predicate = user -> user.getPin().equals(pin);
		User user = users.stream().filter(predicate).findFirst().orElse(null);
		if (null==user) 
			return false;
		else 
			return true;
	}	
	
}

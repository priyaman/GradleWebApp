package com.fedex.priyaman.validator;

import java.util.HashMap;

public class LoginValidator {
	private HashMap<String,String> validCredentials;
	
	public LoginValidator(){
		validCredentials = new HashMap<String, String>();
		validCredentials.put("john.doe@fedex.com", "Password123");
		validCredentials.put("tim.devy@fedex.com", "Developer123");
		validCredentials.put("corn.elius@fedex.com", "Corny123");
		
	}
	
	public static boolean validate(String username, String password){
		String passKey = validCredentials.get(username);
		if(passKey==null)
			return false;
		else if(!passKey.equals(password))
			return false;
		else
			return true;
	}
}

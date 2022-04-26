package com.bl.userregisterationreview;

import java.util.regex.Pattern;

public class UserRegImplemtation implements IUserRegistration {

	@Override
	public boolean validateFName(String fName) {
		String validFirstName = "^[A-Z][a-zA-Z]{2,}";
		Pattern pat = Pattern.compile(validFirstName);
		if(pat.matcher(fName).matches()) {
			System.out.println("Input is valid!!");
			return true;
		}else {
			System.out.println("Input is Invalid!!");
			return false;
		}
	}
}

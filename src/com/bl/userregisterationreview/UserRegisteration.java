package com.bl.userregisterationreview;

import java.util.Scanner;

public class UserRegisteration {
	
	public static void main(String[] args) {
		boolean validOutput = false;
		Scanner sc = new Scanner(System.in);
		UserRegImplemtation reg = new UserRegImplemtation();
		System.out.println("********Welcome to User Registeration using RegEx*********");
		System.out.println();
		while(validOutput == false) {
			System.out.println("Please Enter Your first name!!");
			String fName = sc.nextLine();
			validOutput= reg.validateFName(fName);
			System.out.println();
		}
		
		sc.close();
		
	}
	
	

}

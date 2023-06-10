package com.gl.services;

import java.util.Random;

import com.gl.interfaces.ICredentials;
import com.gl.model.Employee;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(Employee e, String department) {
		String emailAddr = e.getFirstName()+e.getLastName()+"@"+department+".gl.in";
		
		return emailAddr;
	}

	@Override
	public String generateRandomPassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		
		String pswd = twoRandomChars(capitalLetters)+twoRandomChars(smallLetters)+
				twoRandomChars(numbers)+twoRandomChars(specialCharacters);
		
		//System.out.println(" pswd = "+pswd);
		return pswd;
	}

	public String twoRandomChars(String chars) {
		Random r = new Random();
		 int ch1 = r.nextInt(chars.length());
		 int ch2 = r.nextInt(chars.length());
		 String pswd = ""+chars.charAt(ch1)+ chars.charAt(ch2);
		return pswd;
	}
	
	@Override
	public void showCredentials(Employee e,String dept, String pwd,String emailAddr) {
		System.out.println("Employee Details: "+e.getFirstName()+" "+e.getLastName());
		System.out.println("Email Address :"+emailAddr);
		System.out.println("Department = "+dept);
		System.out.println("Password = "+pwd);

	}

}

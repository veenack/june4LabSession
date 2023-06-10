package com.gl.interfaces;

import com.gl.model.Employee;

public interface ICredentials {
	
	public String generateEmailAddress(Employee e, String department);
	public String generateRandomPassword();
	public void showCredentials(Employee e,String dept, String pwd ,String emailAddr);

}

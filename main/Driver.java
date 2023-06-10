package com.gl.main;

import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.services.CredentialService;

public class Driver {

	public static void main(String[] args) {
		String dept="";
         Employee e = new Employee("Veena ","Kulkarni");
         displayMenu();
         Scanner scan = new Scanner(System.in);
         int option = scan.nextInt();
         System.out.println("option : "+option);
         switch(option) {
         case 1: 
        	 dept = "Technical";
        	 break;
         case 2:
        	 dept = "Admin";
        	 break;
         case 3:
        	 dept = "Human Resource";
        	 break;
         case 4: 
        	 dept = "Legal";
        	 break;
        	 
        	 default:
        		 System.out.println("Not correct option");
         }
         
         CredentialService cs = new CredentialService();
         String emailAddress = cs.generateEmailAddress(e, dept);
         String pswd = cs.generateRandomPassword();
         cs.showCredentials(e,dept,pswd,emailAddress);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please enter option from the following:-");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
	}

}

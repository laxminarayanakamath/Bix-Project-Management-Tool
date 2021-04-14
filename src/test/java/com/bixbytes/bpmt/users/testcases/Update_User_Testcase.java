package com.bixbytes.bpmt.users.testcases;

import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Update_User_Testcase extends SuiteSetup
	 {
	 	
	 public Update_User_Testcase() throws Exception 
	 {
	 		super();

	 }
	 
	 @Test
	 public void tc1_update_user() throws Exception, Error
	 {
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.edit_user_profile("User Creation");	
		System.out.print("User edit functionality verification completed\n");
	 }

}

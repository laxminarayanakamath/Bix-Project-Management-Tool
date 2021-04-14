package com.bixbytes.bpmt.users.testcases;

import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class User_Deletion_Testcases extends SuiteSetup
{
	public User_Deletion_Testcases() throws Exception 
	{
			super();

	}
	@Test (priority=1)
	public void tc1_valid_delete_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.deleteuser();	
	}
	
	
}

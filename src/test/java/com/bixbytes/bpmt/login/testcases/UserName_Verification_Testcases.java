package com.bixbytes.bpmt.login.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class UserName_Verification_Testcases extends SuiteSetup
{
	public UserName_Verification_Testcases() throws Exception
	{
		super();
	}
	@Test
	public void tc1_username_after_email_test() throws Exception
	{
		Thread.sleep(5000);
		loginpage.enteremail(prop.getProperty("username"));
		if(loginpage.verifynameofuser()==true)
		{
		Assert.assertEquals(loginpage.nameofuser.getText(), prop.getProperty("adminname"));
		System.out.print("User's name verification is completed \n");
	}
	
	}
}
	
	
	
	
	

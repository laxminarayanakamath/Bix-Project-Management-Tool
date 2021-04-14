package com.bixbytes.bpmt.login.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Login_Testcases extends SuiteSetup
{
	
public Login_Testcases() throws Exception 
{
		super();

}

@Test(priority=1)
public void tc1_valid_login_test() throws Exception
{
  String title = loginpage.validateloginpagetitle();
  Assert.assertEquals(prop.getProperty("loginTitle"), title);
  loginpage.login("Login");
  Thread.sleep(3000);
  Assert.assertTrue(loginpage.verifyloginlogo());
  System.out.print("Valid login testcase execution completed\n");
}

@Test(priority=2)
public void tc2_invalid_login_test() throws Exception
{
	loginpage.login("Invalid Login");	
	Assert.assertTrue(loginpage.verifyloginerror());
	System.out.print("Invaid login testcase excecution completed \n");
	Thread.sleep(5000);
}

@Test(priority=3)
public void tc3_verify_email_and_password_errors() throws Exception
{
	Thread.sleep(3000);
	loginpage.loginbutton.click();
	Assert.assertEquals(loginpage.verify_empty_email_error(), true);
	Thread.sleep(3000);
	Assert.assertEquals(loginpage.verify_empty_password_error(), true);	
	System.out.print("Email and password error message verification completed\n");
}

}

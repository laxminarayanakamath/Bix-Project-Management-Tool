package com.bixbytes.bpmt.login.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Fogot_Password_Testcases extends SuiteSetup
{
	public Fogot_Password_Testcases() throws Exception
	{
		super();
	}
	@Test( priority=1)
	public void tc1_forgotpassword_negative_testcase() throws Exception, Error
	{
		loginpage.clickforgotpassword();
		loginpage.enterforgotemail(prop.getProperty("dummyemail"));
        Assert.assertEquals(loginpage.emailnotregistered(), true);
        System.out.print("Forgot password email registration error verification completed \n");
	}
	
	@Test(priority=2)
	public void tc2_forgotpassword_positive_testcase() throws Exception, Error
	{
		loginpage.clickforgotpassword();
		loginpage.enterforgotemail(prop.getProperty("username"));
		Assert.assertEquals(loginpage.resetemailmessage(), true);
		System.out.print("Forgot Password reset message verification completed \n");
	}
	@Test(priority=3)
	public void tc3_forgot_pasword_to_signin_page_test() throws Exception, Error
	{
		loginpage.clickforgotpassword();
		loginpage.back_to_login();
		Assert.assertEquals(loginpage.verifybixlogo(), true);
		System.out.print("Forgot Password to Sign In page redirection verification completed \n");
}

	
}

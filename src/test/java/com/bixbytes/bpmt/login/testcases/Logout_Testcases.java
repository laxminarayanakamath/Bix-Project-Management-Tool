package com.bixbytes.bpmt.login.testcases;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Logout_Testcases extends SuiteSetup
{
	
public Logout_Testcases() throws Exception
{
		super();
}
@Test
public void tc1_logout() throws Exception
{
Thread.sleep(5000);
generallogin(prop.getProperty("username"), prop.getProperty("password"));
loginpage.logout();
System.out.print("Logout testcase execution completed\n");
}
}

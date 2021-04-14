package com.bixbytes.bpmt.users.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

//import junit.framework.Assert;

public class User_Search_Testcases extends SuiteSetup
{
	
public User_Search_Testcases() throws Exception 
{
		super();

}

//@Test(priority=1)
//public void tc1_valid_usersearch() throws Exception
//{
//	generallogin(prop.getProperty("username"), prop.getProperty("password"));
//	Thread.sleep(3000);
//	usr.gotousermanagement();
//    String searchtext=usr.search("Search Data");
//    Assert.assertEquals(prop.getProperty("name3"), searchtext);
//    System.out.print("Valid user search testcase execution completed\n");
//}

@Test(priority=2)
public void tc2_invalid_usersearch() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	usr.gotousermanagement();
	String invalidtext = usr.invalidsearchtext();
    Assert.assertEquals(invalidtext, prop.getProperty("invalidresult"));
    System.out.print("Invalid user testcase execution completed\n");
}
}
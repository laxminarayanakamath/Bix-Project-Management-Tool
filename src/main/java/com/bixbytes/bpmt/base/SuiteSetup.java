package com.bixbytes.bpmt.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.bixbytes.bpmt.actionpages.UsersPage;
import com.bixbytes.bpmt.actionpages.LoginPage;
import com.bixbytes.bpmt.actionpages.SalesPage;
import com.bixbytes.bpmt.utilities.TestDataReader;

public class SuiteSetup extends TestBase
{
	public LoginPage loginpage;
	public UsersPage usr;
	public SalesPage sp;
	public TestDataReader dataReader;
	
	public SuiteSetup() throws Exception
	{
		super();
	}
	
/* This will run before each test method */	
	
	@BeforeMethod
	public void setUp() 
	{
		initialization();
		loginpage = new LoginPage();
		usr = new UsersPage();
		sp = new SalesPage();
		dataReader = new TestDataReader();
		
	}

/* This will run after each test method */
	
    @AfterMethod
    public void teardown() 
    {
    	driver.quit();
    }

	
}

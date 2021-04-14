package com.bixbytes.bpmt.sales.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Verification_Of_Sales_Pages_Testcases extends SuiteSetup
{
	public Verification_Of_Sales_Pages_Testcases() throws Exception 
	{
			super();

	}
	@Test (priority=1)
	public void tc1_sales_page_navigation_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		Assert.assertTrue(sp.gotosalespage());
		System.out.print("Sales page navigation testcase executed \n");
	}
	
	@Test (priority=2)
	public void tc2_opportunity_page_navigation_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		sp.verifyopportunitypage();
		Thread.sleep(2000);
		Assert.assertTrue(sp.verifyopportunitypage());
		System.out.print("Opportunity page navigation testcase executed \n");
	}
	
	@Test (priority=3)
	public void tc3_customer_page_navigation_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.verifycustomerpage();
		Thread.sleep(2000);
		Assert.assertTrue(sp.verifycustomerpage());
		System.out.print("Customer page navigation testcase executed \n");
		
	}
	
	@Test (priority=4)
	public void tc4_todo_page_navigation_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.verifytodopage();
		Thread.sleep(2000);
		Assert.assertTrue(sp.verifytodopage());
		System.out.print("Todo listing page navigation testcase executed \n");
		
	}
	
	@Test (priority=5)
	public void tc5_meeting_list_page_navigation_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.verifymeetingspage();
		Thread.sleep(2000);
		Assert.assertTrue(sp.verifymeetingspage());
		System.out.print("Meeting listing page navigation testcase executed \n");
		
	}

}

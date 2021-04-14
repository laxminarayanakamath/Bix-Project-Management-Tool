package com.bixbytes.bpmt.sales.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Opportunity_Testcases extends SuiteSetup
{
	public Opportunity_Testcases() throws Exception 
	{
			super();

	}
	@Test (priority=1)
	public void tc1_valid_add_opportunity_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.addopportunity_textfields("Opportunity");
		sp.select_customer_for_opportunity();
		sp.select_contact_for_opportunity();
		sp.select_duedate_opportunity();
		sp.select_responsible();
		sp.save_opportunty();
		System.out.println("Add Opportunity testcase is executed successfully \n");
	}
	
	@Test (priority=2)
	public void tc2_verify_error_messages_in_add_opportunity_popup() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.add_opportunity();
		Thread.sleep(2000);
		sp.save_opportunty();
		Assert.assertEquals(sp.opportunity_name_error(), "Opportunity Name is required");
		Assert.assertEquals(sp.opportunity_duedateerror(), "Due Date is required");
		Assert.assertEquals(sp.opportunity_customer_error(), "Customer is required");
		Assert.assertEquals(sp.opportunity_contacterror(), "Contact is required");
		Assert.assertEquals(sp.opportunity_budget_error(), "Budget is required");
		Assert.assertEquals(sp.opportunity_chance_error(), "Chance is required");
		Assert.assertEquals(sp.opportunity_detailserror(), "Details is required");
		System.out.println("Add Opportunity field error messsages are verified successfully \n");
	}
	
	@Test(priority=3)
	public void tc3_verify_invalid_opportunity_search() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		String text = sp.Invalidsearchlist("Invalid Search");
		Assert.assertEquals(text, "No records found");
		System.out.println("Invalid opportuity search testcase is executed successfully \n");	
		
	}
	
	@Test(priority=4)
	public void tc4_verify_valid_opportunity_search() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		String searchresult = sp.search("Search Data", 1, 1);
		Assert.assertEquals(searchresult,sp.searchvalue("Search Data", 1, 1));
		System.out.println("Valid opportunity search testcase is executed \n");
	}
	
	@Test(priority=5)
	public void tc5_verify_update_opportunity() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.updateopportunity("Opportunity");
		System.out.println("Opportunity update testcase excecuted successfully \n");
	}
	
	@Test(priority=6)
	public void tc6_verify_delete_opportunity() throws Exception, Error
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.deleteopportunity("Opportunity");
		System.out.println("Opportunity deletion testcase excecuted successfully \n");
	}
	
	@Test(priority=7)
	public void tc7_verify_export_opportunity_list_pdf() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.export_pdf();
		System.out.println("Opportunity list export in pdf test is executed \n");
	}
	@Test(priority=8)
	public void tc8_verify_export_opportunity_list_excel() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		sp.gotosalespage();
		Thread.sleep(2000);
		sp.export_excel();
		System.out.println("Opportunity list export in excel test is executed \n");
	}
}
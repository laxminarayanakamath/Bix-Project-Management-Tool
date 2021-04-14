package com.bixbytes.bpmt.sales.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Meeting_Testcases extends SuiteSetup
{
	public Meeting_Testcases() throws Exception 
	{
			super();

	}
//	@Test (priority=1)
//	public void tc1_add_new_call_meeting() throws Exception, Error
//	{
//
//		generallogin(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		sp.gotosalespage();
//		Thread.sleep(2000);
//		sp.verifymeetingspage();
//		sp.add_new_call_meeting_and_search("Misc");
//		System.out.print("Add Call Meeting and Search testcase executed \n");
//	}
//
//	@Test (priority=2)
//	public void tc2_meeting_erros() throws Exception
//	{
//		generallogin(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		sp.gotosalespage();
//		Thread.sleep(2000);
//		sp.verifymeetingspage();
//		sp.meeting_add_pop();
//		Thread.sleep(5000);
//		Assert.assertTrue(sp.meeting_customer_error());
//		Assert.assertTrue(sp.meeting_date_error());
//		Assert.assertTrue(sp.meeting_responsible_error());
//		Assert.assertTrue(sp.meeting_status_error());
//		Assert.assertTrue(sp.meeting_details_error());
//		System.out.print("Meeting popup error verification testcase executed \n");
//	}
//
////	@Test (priority=3)
////	public void tc3_delete_meeting()
////	{
////		
////
////	}
////	@Test (priority=4)
////	public void tc4_valid_search_meeting()
////	{
////	}
//
////	@Test (priority=5)
////	public void tc5_edit_meeting()
////	{
////
////	}
//
//	@Test(priority=6)
//	public void tc6_export_meetinglist_to_excel() throws Exception
//	{
//		generallogin(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		sp.gotosalespage();
//		Thread.sleep(2000);
//		sp.verifycustomerpage();
//		Thread.sleep(2000);
//		sp.export_excel();;
//		System.out.print("Meeting List excel export testcase excecuted \n");
//	}
//
//	@Test(priority=7)
//	public void tc7_export_meetinglist_to_pdf() throws Exception
//	{
//		generallogin(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		sp.gotosalespage();
//		Thread.sleep(2000);
//		sp.verifycustomerpage();
//		Thread.sleep(2000);
//		sp.export_pdf();;
//		System.out.print("Meeting List pdf export testcase excecuted \n");
//	}
//	@Test(priority=8)
//	public void tc8_add_new_inperson_meeting() throws Exception, Error 
//	{
//		generallogin(prop.getProperty("username"), prop.getProperty("password"));
//		Thread.sleep(3000);
//		sp.gotosalespage();
//		Thread.sleep(2000);
//		sp.verifymeetingspage();
//		sp.add_new_inperson_meeting_and_search("Misc");
//		System.out.print("Add Call Meeting and Search testcase executed \n");
//	}
//	
////	@Test(priority=9)
////	public void tc9_invalid_meeting_search()
////	{
////		
////	}
}

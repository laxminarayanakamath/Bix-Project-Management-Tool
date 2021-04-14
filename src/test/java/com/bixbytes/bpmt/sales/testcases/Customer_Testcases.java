package com.bixbytes.bpmt.sales.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class Customer_Testcases extends SuiteSetup
{
	public Customer_Testcases() throws Exception 
	{
			super();

	}
@Test (priority=1)
public void tc1_add_new_customer() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	sp.add_new_customer_and_search("Customer Creation");
	System.out.print("Add customer testcase executed successfully \n");
}

@Test (priority=2)
public void tc2_new_customer_errors() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	Thread.sleep(3000);
	sp.customer_add_popup();
	Thread.sleep(5000);
	Assert.assertTrue(sp.customer_name_error());
	Assert.assertTrue(sp.customer_contact_error());
	Assert.assertTrue(sp.customer_city_error());
	Assert.assertTrue(sp.customer_country_error());
	Assert.assertTrue(sp.customer_email_error());
	Assert.assertTrue(sp.customer_industry_error());
	Assert.assertTrue(sp.customer_postal_code_error());
	Assert.assertTrue(sp.customer_street_error());
	Assert.assertTrue(sp.customer_street_no_error());
	Assert.assertTrue(sp.customer_details_error());
	System.out.print("Add customer porpup errormesage verification testcases executed successfully \n");
}


@Test (priority=4)
public void tc5_edit_customer() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	Thread.sleep(3000);
	sp.edit_customer("Misc");
	System.out.print("Edit Customer \n");
}

@Test(priority=5)
public void tc5_export_customerlist_to_excel() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	Thread.sleep(2000);
	sp.export_pdf();;
	System.out.print("Customer List pdf export testcase excecuted \n");
}

@Test(priority=6)
public void tc6_export_customerlist_to_pdf() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	Thread.sleep(2000);
	sp.export_excel();
	System.out.print("Customer List excel export testcase excecuted \n");
	
}
@Test (priority=7)
public void tc7_delete_customer() throws Exception
{
	generallogin(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(3000);
	sp.gotosalespage();
	Thread.sleep(2000);
	sp.verifycustomerpage();
	sp.deletecust("Customer Creation");
	System.out.print("Excecuted delete customer testcase\n");

}
}
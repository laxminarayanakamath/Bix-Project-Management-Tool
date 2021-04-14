package com.bixbytes.bpmt.users.testcases;
import org.testng.annotations.Test;
import com.bixbytes.bpmt.base.SuiteSetup;

public class Add_User_Positive_Testcases extends SuiteSetup
	{
		
public Add_User_Positive_Testcases() throws Exception 
	{
			super();

	}

	@Test (priority=1)
	public void tc1_add_admin_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_admin_role();
		usr.select_reporting_manager();
		usr.submituser();	
		System.out.print("Admin user testcase executed successfully");
	}
	
	@Test  (priority=2)
	public void tc2_add_sales_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_sales_role();
		usr.select_reporting_manager();
		usr.submituser();	
		System.out.print("Sales user testcase executed successfully");

	}
	
	@Test  (priority=3)
	public void tc3_add_management_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_management_role();
		usr.select_reporting_manager();
		usr.submituser();
		System.out.print("Management user testcase executed successfully");

	}
	
	@Test  (priority=4)
	public void tc4_add_lead_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_lead_role();
		usr.select_reporting_manager();
		usr.submituser();	
		System.out.print("Lead user testcase executed successfully");

	}
	@Test  (priority=5)
	public void tc5_add_member_user_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_member_role();
		usr.select_reporting_manager();
		usr.submituser();	
		System.out.print("Member user testcase executed successfully");

	}
}

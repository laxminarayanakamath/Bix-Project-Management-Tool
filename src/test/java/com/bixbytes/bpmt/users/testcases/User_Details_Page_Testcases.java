package com.bixbytes.bpmt.users.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bixbytes.bpmt.base.SuiteSetup;

public class User_Details_Page_Testcases extends SuiteSetup 
{
	public User_Details_Page_Testcases() throws Exception 
{
	super();

}

@Test (priority=1)
public void tc1_verify_personal_userdetails_info() throws Exception
{
generallogin(prop.getProperty("username"), prop.getProperty("password"));
Thread.sleep(3000);
boolean status= usr.user_detail_personal_info("Search Data");
Thread.sleep(3000);
Assert.assertTrue(status);
}

@Test (priority=2)
public void tc2_verify_employee_userdetails_info() throws Exception
{
generallogin(prop.getProperty("username"), prop.getProperty("password"));
Thread.sleep(3000);
boolean status2 =usr.user_detail_employee_info("Search Data");
Thread.sleep(3000);
Assert.assertTrue(status2);
}

@Test (priority=3)
public void tc3_verify_employee_userdetails_user_progress_graph() throws Exception
{
generallogin(prop.getProperty("username"), prop.getProperty("password"));
Thread.sleep(3000);
boolean status3 =usr.user_detail_progress_section_verification("Search Data");
Thread.sleep(3000);
Assert.assertTrue(status3);
}

//@Test (priority=4)
//public void tc4_verify_employee_userdetails_projects_table() throws Exception
//{
//generallogin(prop.getProperty("username"), prop.getProperty("password"));
//Thread.sleep(3000);
//boolean status3 =usr.user_detail_projects_table_verification("Search Data");
//Assert.assertTrue(status3);
//}
//
//@Test (priority=5)
//public void tc5_verify_employee_userdetails_asigned_tasks() throws Exception
//{
//generallogin(prop.getProperty("username"), prop.getProperty("password"));
//Thread.sleep(3000);
//boolean status4 =usr.user_detail_assigned_tasks_verification("Search Data");
//Assert.assertTrue(status4);
//}




}
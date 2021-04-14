package com.bixbytes.bpmt.users.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.bixbytes.bpmt.base.SuiteSetup;
public class Add_User_Error_Verification_Testcases extends SuiteSetup
{
	public Add_User_Error_Verification_Testcases() throws Exception 
	{
			super();

	}

	@Test (priority=1)
	public void tc1_verify_empty_error_messages_in_add_user_page_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.submituser();
		Thread.sleep(5000);
		Assert.assertEquals(usr.verify_empty_firstname_error_in_adduserpage(), "The First name is required");
		Assert.assertEquals(usr.verify_empty_lastname_error_in_adduserpage(),"The Last name is required");
		Assert.assertEquals(usr.verify_empty_emailid_error_in_adduserpage(),"The Email is required");
		Assert.assertEquals(usr.verify_empty_mobileno_error_in_adduserpage(),"The Mobile No is required");
		Assert.assertEquals(usr.verify_empty_dob_error_in_adduserpage(),"The Date of Birth is required");
		Assert.assertEquals(usr.verify_empty_bloodgroup_error_in_adduserpage(),"The Blood Group is required");
		Assert.assertEquals(usr.verify_empty_address_error_in_adduserpage(),"The Address is required");
		Assert.assertEquals(usr.verify_empty_empid_error_in_adduserpage(),"The Employee ID is required");
		Assert.assertEquals(usr.verify_empty_doj_error_in_adduserpage(),"The Joining Date is required");
		Assert.assertEquals(usr.verify_empty_department_error_in_adduserpage(),"The Department is required");
		Assert.assertEquals(usr.verify_empty_designation_error_in_adduserpage(),"The Designation is required");
		Assert.assertEquals(usr.verify_empty_role_error_in_adduserpage(),"The Role is required");
		Assert.assertEquals(usr.verify_empty_reporting_error_in_adduserpage(),"The Reporting To is required");
		System.out.print("Verification of error messages for add user empty fields completed \n");
    }
	
	@Test (priority=2)
	public void tc2_verify_add_user_firstname_and_lastname_length_error_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation Invalid");
		usr.submituser();	
		//Assert.assertEquals(usr.verify_first_name_validation_error(), "First name must have at least 2 letters.");
		Assert.assertEquals(usr.verify_last_name_validation_error(), "Last name must have at least 2 letters.");
		System.out.print("First and Last name length error message verification completed\n");
   }
	@Test (priority=3)
	public void tc3_verify_add_user_emailid_format_error_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation Invalid");
		usr.submituser();
		Assert.assertEquals(usr.verify_email_format_error(), "Email ID cannot exceed 191 letters.");
		System.out.print("Email format error message verification completed\n");
   }
	@Test (priority=4)
	public void tc4_verify_add_user_mobile_no_format_error_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation Invalid");
		usr.submituser();
		Assert.assertEquals(usr.verify_mobileno_field_error(), "Mobile No must have at least 11 digits.");
		System.out.print("Mobile number length error message verification completed\n");
   }
	
	@Test (priority=5)
	public void tc5_verify_add_user_address_and_bloodgroup_length_error_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_mandatory_user_details("User Creation Invalid");
		usr.submituser();
		Assert.assertEquals(usr.verify_address_field_error(), "Address cannot exceed 300 letters.");
		Assert.assertEquals(usr.verify_blood_group_format(), "Blood Group cannot exceed 15 letters.");
		System.out.print("Blood group and address field length error message verification completed\n");
   }
	@Test (priority=6)
	public void tc6_verify_add_user_employee_id_length_error_test() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.enter_emp_id();
		usr.submituser();
		String error= usr.verify_empid_format_error();
		Thread.sleep(3000);
		Assert.assertEquals(error,"Employee ID cannot exceed 15 letters.");
		System.out.print("Employee ID length error message verification completed\n");
   }
	@Test (priority=7)
	public void tc7_verify_add_user_duplicate_data_errors() throws Exception
	{
		generallogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		usr.clickadduser();
		usr.add_user_duplicate_test("User Creation Duplicate");
		usr.date_of_birth();
		usr.date_of_join();
		usr.select_department("User Creation");
		usr.select_designation("User Creation");
		usr.select_admin_role();
		usr.select_reporting_manager();
		usr.submituser();
		Assert.assertEquals(usr.duplicate_emailid(), "The email has already been taken.");
		Assert.assertEquals(usr.duplicate_employeeid(), "The employee id has already been taken.");
		//Assert.assertEquals(usr.duplicate_mobile_no(), "The mobile no has already been taken.");
		System.out.print("Toast error message for unique email id, employee id and mobile number is verified\n");
	}
	
	
	
		
	
}
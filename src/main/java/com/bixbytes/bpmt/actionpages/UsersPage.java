package com.bixbytes.bpmt.actionpages;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bixbytes.bpmt.base.TestBase;
import com.bixbytes.bpmt.commonmethods.VisibilityCheck;
import com.bixbytes.bpmt.utilities.Testutil;
import com.bixbytes.bpmt.utilities.TestDataReader;
public class UsersPage extends TestBase
{
	VisibilityCheck vck = new VisibilityCheck();
	Testutil tk = new Testutil();
	TestDataReader testdatareader;
	String[][] getUserData = null;
	String phone;
	String uniqueid;
	String username1;
	
	/*---------------------------Add User Locators----------------------------------------*/	
	@FindBy (xpath="//h2[contains(text(),\"Add User\")]")
	WebElement addusertitle;
	
	@FindBy (xpath="//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy (xpath="(//input[@class='md-input'])[4]")
	WebElement lastname;
	
	@FindBy (xpath="//span[contains(text(),'The First name is required')]")
	WebElement firstnameerror;

	@FindBy (xpath="//span[contains(text(),'The Last name is required')]")
	WebElement lastnameerror;
	
	@FindBy (xpath="//input[@id='emailId']")
	WebElement emailaddressfield;	
	
	@FindBy (xpath ="//span[contains(text(),'The Email is required')]")
	WebElement emailaddresserror;
	
	@FindBy (xpath="//input[@id='mobileNo']")
	WebElement mobileno;
	
	@FindBy (xpath="//span[contains(text(),'The Mobile No is required')]")
	WebElement mobilenoerror;
	
	@FindBy(xpath="")
	WebElement password;
	
	@FindBy (xpath="")
	WebElement passworderror;
	
	@FindBy (xpath="//label[contains(text(),'Date of Birth')]")
    WebElement dob;
	
	@FindBy (xpath="//span[contains(text(),'The Date of Birth is required')]")
    WebElement doberror;
	
	@FindBy (css="div > div.vd-picker__body > div.vd-picker__controls > button.vd-picker__controls-prev")
	WebElement leftarrow;
	
	@FindBy (xpath="(//span[@class='vd-icon'])[2]")
	WebElement rightarrow;
	
	@FindBy (css=" span.vd-picker__controls-month > div > button")
	WebElement dobmonthname;
	
	@FindBy (xpath="(//span[@class='vd-picker__controls-year']/div/button)[1]")
	WebElement dobcurrentyear;
	
	@FindBy (css="div > span.vd-picker__table-day__text")
	List <WebElement> days;
	
	@FindBy (xpath="(//input[@type='text'])[11]")
	WebElement bloodgroup;
	
	@FindBy (xpath="//span[contains(text(),'The Blood Group is required')]")
	WebElement bloodgrouperror;
	
	@FindBy(xpath="//textarea[@class='md-textarea']")
	WebElement address;
	
	@FindBy(xpath="//span[contains(text(),'The Address is required')]")
	WebElement addresserror;
	
	@FindBy(xpath="(//label[contains(text(),'Joining Date')])[2]")
	WebElement joindate;
	
	@FindBy (xpath="//span[contains(text(),'The Joining Date is required')]")
    WebElement joindateerror;
	
	@FindBy(xpath="(//span[@class='vd-icon'])[3]")
	WebElement leftarrow2;
	
	@FindBy(xpath="(//span[@class='vd-icon'])[4]")
	WebElement rightarrow2;
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement employeeid;
	
	@FindBy(xpath="//span[contains(text(),'The Employee ID is required')]")
	WebElement emperror;
	
	@FindBy(xpath="//div[@class='vd-picker__selects-years__button']/button")
	List <WebElement> years;
	
	@FindBy(xpath="//div[@class='vd-picker__selects-months__button']/button")
	List <WebElement> months;
	
	@FindBy (xpath="(//span[@class='vd-picker__controls-month']/div/button)[2]")
	WebElement dojmonthname;
	
	@FindBy (xpath="(//span[@class='vd-picker__controls-year']/div/button)[2]")
	WebElement dojcurrentyear;
	
	@FindBy (xpath="//input[@name='department']")
	WebElement department;
	
	@FindBy (xpath="//input[@name='role']")
	WebElement roles;

	@FindBy (xpath="//input[@name='designation']")
	WebElement designation;
	
	@FindBy (xpath="//span[contains(text(),'The Designation is required')]")
	WebElement designationerror;
	
	@FindBy (xpath="//span[contains(text(),'The Department is required')]")
	WebElement depterror;
	
	@FindBy (xpath="//input[@name='reportingTo']")
	WebElement reportingmanager;
	
	@FindBy (xpath="//span[contains(text(),'The Reporting To is required')]")
	WebElement reportingmanagererror;
	
	@FindBy (xpath="//span[contains(text(),'The Role is required')]")
	WebElement roleserror;
	
	@FindBy(xpath="//span[@class='md-list-item-text']")
	List <WebElement> dropdownvalues; 

	@FindBy (xpath="(//div[contains(text(),'Add')])[2]")
	WebElement submit;
	
	@FindBy (xpath="//div[contains(text(),'Update')]")
	WebElement update;
	
	@FindBy (xpath="")
	WebElement useraddsuccessmsg;
	
	/*-------------------------------User Listing page locators------------------------------*/
	
	@FindBy (xpath="//span[contains(text(),'Users')]")
	WebElement userbreadcrumb;
	
	@FindBy (xpath="//button[@class='md-button disableHover md-theme-default']")
	WebElement action;
	
	@FindBy (xpath="//div[@class='search_bar']")
	WebElement searchicon;
	
	@FindBy (xpath="(//input[@class='md-input'])[2]")
	WebElement searchbar;
	
	@FindBy (xpath="//div[contains(text(),'No records found')]")
	WebElement searchnoresult;
	
	@FindBy (xpath="//span[contains(text(),'EDIT')]")
	WebElement edit;
	
	@FindBy (xpath="//span[contains(text(),'DELETE')]")
	WebElement delete;
	
	@FindBy (xpath="//span[@class='user_name text_primary']")
	WebElement userrow;
	
	@FindBy(xpath="//p[contains(text(),'Users')]")
	WebElement usermenu;
	
	@FindBy (css=" div > div > div > div:nth-child(3) > button > div > div > img")
	WebElement addUser;
	
	@FindBy(xpath="//img[@class='cursor-pointer filter_icon']")
	WebElement filter;
	
	@FindBy(xpath="//input[@name='f']")
	WebElement department_filter;
	
	@FindBy(xpath="//input[@name='filterDesignation']")
	WebElement designation_filter;
	
	@FindBy(xpath="//span[@class='md-list-item-text']")
	List<WebElement> filtercheckbox;
	
	@FindBy(xpath="//input[@id='todate']")
	WebElement joiningdate_filter;
	
	@FindBy(css=" button.md-button.btn_primary.md-raised.md-primary.border-round-10.flex-fill.md-theme-default > div")
	WebElement delete_yes;
	
	
	/*----------------------------------------User Details page locators--------------------------*/
	
	@FindBy(xpath="(//div[@class='img-text']/p)[1]")
	WebElement user_name;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[2]")
	WebElement personalemail;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[4]")
	WebElement personalcontact;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[6]")
	WebElement userdob;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[8]")
	WebElement userbloodgroup;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[10]")
	WebElement userempid;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[12]")
	WebElement userdoj;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[14]")
	WebElement userdepartment;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[16]")
	WebElement userrole;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[18]")
	WebElement userdesignation;
	
	@FindBy (xpath="(//div[@class='md-card-content']/div/div/div/div)[18]")
	WebElement userreportingmanager;
	
	@FindBy (xpath="//p[contains(text(),'Projects')]")
	WebElement projecttable;
	
	@FindBy (xpath="//p[contains(text(),'Assigned Task')]")
	WebElement assignedtask;
	
	@FindBy (xpath="//p[contains(text(),'User Progress')]")
	WebElement userprogress;
	
	@FindBy (xpath="")
	WebElement activity;
	
	@FindBy(xpath="//div[contains(text(),'UPLOAD')]")
	WebElement upload;
	
	/*----------------------------------Add user validation error-------------------------------------*/
	
	@FindBy(xpath="//span[contains(text(),'First name must have at least 2 letters.')]")
	WebElement firstnameinvalid_error;
	
	@FindBy(xpath="//span[contains(text(),'Last name must have at least 2 letters.')]")
	WebElement lastnameinvalid_error;
	
	@FindBy(xpath="//span[contains(text(),'Email ID cannot exceed 191 letters.')]")
	WebElement emailformaterror;
	
	@FindBy(xpath="//span[contains(text(),'Blood Group cannot exceed 15 letters')]")
	WebElement bloodgroupformat;
	
	@FindBy(xpath="//span[contains(text(),'Address cannot exceed 300 letters.')]")
	WebElement addresscharerror;
	
	@FindBy(xpath="//span[contains(text(),'Mobile No must have at least 11 digits.')]")
	WebElement mobileerror;
	
	@FindBy(xpath="//span[contains(text(),'Employee ID cannot exceed 15 letters.')]")
	WebElement empidformaterror;
	
	@FindBy(xpath="//li[contains(text(),'The employee id has already been taken.')]")
	WebElement duplicate_empid;
	
	@FindBy(xpath="//li[contains(text(),'The email has already been taken.')]")
	WebElement duplicate_emailid;
	
	@FindBy(xpath="//li[contains(text(),'The mobile no has already been taken.')]")
	WebElement duplicate_mobno;
	
	/*-------------------------------------------date picker locators---------------------------------*/
	@FindBy(xpath="//input[@id=\"form.dateOfBirth\"]")
	WebElement dob2;
	
	@FindBy(css="div > div.vd-picker__body > div.vd-picker__selects > div > div.vd-picker__controls > button.vd-picker__controls-prev > span > svg")
	WebElement left;
	
	/*--------------------------------------Constructor---------------------------------------------*/
	public UsersPage()
	{
		PageFactory.initElements(driver, this);
		testdatareader = new TestDataReader();
	}
	
	/*--------------------------------------Go to users page-----------------------------------------*/
	public void gotousermanagement() throws Exception, Error
	{
		vck.checkIsAvailable(usermenu);
		usermenu.click();
	}
	
	//Go to user page and verify title
//	public String userpageverification() throws Exception
//	{
//		Thread.sleep(1000);
//		vck.checkIsAvailable(userpageheader);
//		String employeepagetitle = userpageheader.getText();
//		return employeepagetitle;	
//	}
	
	/*-------------------------------------Click on Add User button--------------------------------*/
	public void clickadduser() throws Exception
	{
		vck.checkIsAvailable(addUser);
		addUser.click();
	}
	
	/*------------------------------------Verify Add User page title-----------------------------*/
	public String verifycreateusertitle() throws Exception, Error
	{
		vck.checkIsAvailable(addusertitle);
		String addtitle= addusertitle.getText();
		return addtitle;	
	}
	
	/*------------------------------Enter new user mandatory field-----------------------------*/
	public void enter_mandatory_user_details(String sheetname) throws Exception, Error
	{
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		getUserData = testdatareader.getcelldata(sheetname);
		
		vck.checkIsAvailable(firstname);
		vck.checkIsAvailable(lastname);
		vck.checkIsAvailable(emailaddressfield);
		vck.checkIsAvailable(mobileno);
		username1 = getUserData[1][0]+randomestring();
		firstname.sendKeys(username1);
		lastname.sendKeys(getUserData[1][1]);
		emailaddressfield.sendKeys(alphanumeric()+getUserData[1][2]);
		phone = randomeNum()+getUserData[1][3];
		mobileno.sendKeys(phone);
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView(true);", submit);
		bloodgroup.sendKeys(getUserData[1][4]);
		address.sendKeys(getUserData[1][5]);
		uniqueid=randomeNum();
		employeeid.sendKeys(uniqueid);
	}
	
	/*----------------------------Add user with duplicate details---------------------------------*/
	public void add_user_duplicate_test(String sheetname) throws Exception
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		getUserData = testdatareader.getcelldata(sheetname);
		firstname.sendKeys(getUserData[1][0]);
		lastname.sendKeys(getUserData[1][1]);
		emailaddressfield.sendKeys(getUserData[1][2]);
		mobileno.sendKeys(getUserData[1][3]);
		employeeid.sendKeys(getUserData[1][4]);
		bloodgroup.sendKeys(getUserData[1][5]);
		address.sendKeys(getUserData[1][6]);
		je.executeScript("arguments[0].scrollIntoView(true);", submit);	
	}
	
	/*--------------------------------Enter user's date of birth-----------------------------------*/
	public void date_of_birth() throws Exception
	{
		dob.click();
		Thread.sleep(5000);
		dobmonthname.click();
		if(left.isDisplayed()==true)
		{
		int x =0;
		while(x<15)
		{
			left.click();
			x++;
		}
		}
		Thread.sleep(5000);
		for (int j=0; j<24; j++)
		{
			for (WebElement m:months)
			{
				if(m.getText().equals("Jul"))
				{
					m.click();
					Thread.sleep(3000);
					for (int i=0; i<days.size();i++)
					{
						for (WebElement d:days)
						{ 
						 //System.out.println(d.getText());
						 if(d.getText().equals("9"))
						 {
							 d.click();
							 Thread.sleep(3000);
							 return;
							 
						 }
						}
				    }
				}
			}  }	  
	}
	
	/*--------------------------------Enter user's joining date-----------------------------------*/
	public void date_of_join() throws Exception
	{ 
		joindate.click();
		Thread.sleep(5000);
        dojmonthname.click();
        for (int j=0; j<12; j++)
		{
			for (WebElement m:months)
			{
				if(m.getText().equals("Jul"))
				{
					m.click();
					Thread.sleep(3000);
					for (int i=0; i<days.size();i++)
					{
						for (WebElement d:days)
						{ 
						 //System.out.println(d.getText());
						 if(d.getText().equals("9"))
						 {
							 d.click();
							 Thread.sleep(3000);
							 return;
							 
						 }
						}
				    }
				}
			}  }

		}	
	
	/*-----------------------------Select user's department----------------------------*/
	public void select_department(String sheetname2) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname2);
		department.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement dept:dropdownvalues)
			 {
			   if(dept.getText().equals(getUserData[1][6]))
			    {
				   dept.click();
				   return;
			    }
			 }
			}
	}
	/*---------------------------Select admin role ------------------*/		
	public void select_admin_role() throws Exception
	{
		roles.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement role1:dropdownvalues)
			 {
			   if(role1.getText().equals(prop.getProperty("name")))
			    {
				   role1.click();
				   return;
			    }
			 }
			}
		
	}
	/*---------------------------Select sales role ------------------*/	
	public void select_sales_role() throws Exception
	{
		roles.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement role1:dropdownvalues)
			 {
			   if(role1.getText().equals(prop.getProperty("userrole")))
			    {
				   role1.click();
				   return;
			    }
			 }
			}
		
	}
	/*---------------------------Select management role------------------*/		
	public void select_management_role() throws Exception
	{
		roles.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement role1:dropdownvalues)
			 {
			   if(role1.getText().equals(prop.getProperty("managementrole")))
			    {
				   role1.click();
				   return;
			    }
			 }
			}
		
	}
	/*--------------------------Select lead role -------------------*/		
	public void select_lead_role() throws Exception
	{
		roles.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement role1:dropdownvalues)
			 {
			   if(role1.getText().equals("Lead"))
			    {
				   role1.click();
				   return;
			    }
			 }
			}
	}
	/*---------------------------Select member role ------------------*/		
	public void select_member_role() throws Exception
	{
		roles.click();
		Thread.sleep(2000);
		 for (int j=0; j<25; j++)
			{
			 for (WebElement role1:dropdownvalues)
			 {
			   if(role1.getText().equals("Member"))
			    {
				   role1.click();
				   return;
			    }
			 }
			}
	}
	/*---------------------------Select user's designation ------------------*/		
	public void select_designation(String sheetname3) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname3);
		designation.click();
		Thread.sleep(2000);
		for (int j=0; j<25; j++)
		{
		 for (WebElement des:dropdownvalues)
		 {
		   if(des.getText().equals(getUserData[2][8]))
		    {
			   des.click();
			   return;
		    }
		 }
		}
		
	}
	/*---------------------------Select user's reporting manager------------------*/		
	public void select_reporting_manager() throws Exception
	{
		reportingmanager.click();
		Thread.sleep(2000);
		for (int j=0; j<25; j++)
		{
		 for (WebElement rep:dropdownvalues)
		 {
		   if(rep.getText().equals("Dinesh Shenoy M"))
		    {
			   rep.click();
			   return;
		    }
		 }
		}
		
	}
	
    /*--------------------------Click on submit button of add user page------------------*/
    public void submituser() throws Exception, Error
    {
    	vck.checkIsAvailable(submit);
    	submit.click();
    	Thread.sleep(2000);
    	//Assert.assertEquals(successuseradded.getText(), "Successfully added");  	
    }   
    
    /*---------------------------Search a valid employee-------------------------------*/		
    public String search(String sheetname) throws InterruptedException, Error, Exception
    {
    	vck.checkIsAvailable(searchicon);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	Thread.sleep(10000);
    	return userrow.getText();
    }
    /*---------------------------Invalid employee search--------------------------*/		
    public String invalidsearchtext() throws Exception, Error
    {
			vck.checkIsAvailable(searchicon);
			searchicon.click();
			searchbar.sendKeys(alphanumeric());
			Thread.sleep(10000);
			return searchnoresult.getText();
    }

    /*---------Verify validation error messages for empty fields in add user page----------*/
    
    public String verify_empty_firstname_error_in_adduserpage()
    {
    	String fnameerror =firstnameerror.getText();
    	return fnameerror;
    }
    
    public String verify_empty_lastname_error_in_adduserpage()
    {
    	String lnameerror =lastnameerror.getText();
    	return lnameerror;
    }
    
    public String verify_empty_emailid_error_in_adduserpage()
    {
    	String emailerror = emailaddresserror.getText();
    	return emailerror;
    }
    
    public String verify_empty_mobileno_error_in_adduserpage()
    {
    	String mobeerror =mobilenoerror.getText();
    	return mobeerror;
    }

    public String verify_empty_dob_error_in_adduserpage()
    {
    	String birtherror =doberror.getText();
    	return birtherror;
    }
    
    public String verify_empty_doj_error_in_adduserpage()
    {
    	String joinerror =joindateerror.getText();
    	return joinerror;
    }
    
    public String verify_empty_bloodgroup_error_in_adduserpage()
    {
    	String blooderror =bloodgrouperror.getText();
    	return blooderror;
    }
    
    public String verify_empty_address_error_in_adduserpage()
    {
    	String addrerror = addresserror.getText();
    	return addrerror;
    }
    
    public String verify_empty_empid_error_in_adduserpage()
    {
    	String empiderror = emperror.getText();
    	return empiderror;
    }
    
    public String verify_empty_designation_error_in_adduserpage()
    {
    	String deserror = designationerror.getText();
    	return deserror;
    }
    
    public String verify_empty_department_error_in_adduserpage()
    {
    	String deprerror = depterror.getText();
    	return deprerror;
    }
    
    public String verify_empty_role_error_in_adduserpage()
    {
    	String rolerror = roleserror.getText();
    	return rolerror;
    }
    
    public String verify_empty_reporting_error_in_adduserpage()
    {
    	String rmerror = reportingmanagererror.getText();
    	return rmerror;
    }
    
    /*--------------Validation error messages for add user fields----------------*/
    public String verify_first_name_validation_error()
    {
		return firstnameinvalid_error.getText();
    	
    }
   
    public String verify_last_name_validation_error()
    {
		return lastnameinvalid_error.getText();
    	
    }
    
    public String verify_email_format_error()
    {
		return emailformaterror.getText();
    	
    }
    
    public String verify_blood_group_format()
    {
    	return bloodgroupformat.getText();
    }
    
    public String verify_address_field_error()
    {
    	return addresscharerror.getText();
    }
    
    public String verify_mobileno_field_error()
    {
    	return mobileerror.getText();
    }
    
    public String verify_empid_format_error() throws Exception
    {
    	String eid= empidformaterror.getText();
    	return eid;
    }
    
    public void enter_emp_id()
    {
    	employeeid.sendKeys(randomcharacters());
    }
    
    public String duplicate_employeeid()
    {
    	return duplicate_empid.getText();
    }
    
    public String duplicate_emailid()
    {
    	return duplicate_emailid.getText();
    }
    public String duplicate_mobile_no()
    {
    	return duplicate_mobno.getText();
    }
    
    /*---------------------------Update existing user-----------------------*/		
    public void edit_user_profile(String sheetname) throws Exception, Error
    {
    	
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	Thread.sleep(10000);
    	action.click();
    	edit.click();
    	JavascriptExecutor je = (JavascriptExecutor) driver;
    	je.executeScript("arguments[0].scrollIntoView(true);", update);
    	Thread.sleep(1000);
    	address.clear();
    	address.sendKeys(getUserData[1][5]);
    	update.click();
    	//Assert.assertEquals(successuserupdated.getText(), "Successfully updated");
    }
    /*--------------------------Verification of user's name is breadcrumb------------------*/		
    public String breadcrumb_name_in_user_listing_page()
    {
    	return userbreadcrumb.getText();
    }
    
    /*--------------------------User's personal information------------------*/
    public boolean user_detail_personal_info(String sheetname) throws Exception
    {
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	userrow.click();
    	Thread.sleep(3000);
    	System.out.print("User email address is" + personalemail.getText()+"\n");
    	System.out.print("User contact number is"+ personalcontact.getText()+"\n");
    	System.out.print("User date of birth is"+ userdob.getText()+"\n");
    	System.out.print("User employee ID is"+ userempid.getText()+"\n");
    	return userempid.isDisplayed();
    }
    
    /*---------------------User Details employee information-----------------------*/
    public boolean user_detail_employee_info(String sheetname) throws Exception
    {
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	userrow.click();
    	Thread.sleep(3000);
    	System.out.print("User date of joining is" + userdoj.getText()+"\n");
    	System.out.print("User department is"+ userdepartment.getText()+"\n");
    	System.out.print("User role is"+ userrole.getText()+"\n");
    	System.out.print("User designation is"+ userdesignation.getText()+"\n");
    	System.out.print("User designation is"+ userreportingmanager.getText()+"\n");
		return userdoj.isDisplayed();
    }	
    
    
    /*------------------------User Details Progress Section-------------------------*/
    public boolean user_detail_progress_section_verification(String sheetname) throws Exception
    {
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	userrow.click();
    	return userprogress.isDisplayed();
    }
    
    
  /*--------------------------User Details Projects Table-------------------------------*/
   
    public boolean user_detail_projects_table_verification(String sheetname) throws Exception
    {
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	Thread.sleep(3000);
    	userrow.click();
    	return projecttable.isDisplayed();
    }
   
    /*------------------User Detail Assigned Task table--------------------------------*/
    
    public boolean user_detail_assigned_tasks_verification(String sheetname) throws Exception
    {
    	Thread.sleep(1000);
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
    	searchbar.sendKeys(getUserData[1][0]);
    	Thread.sleep(3000);
    	userrow.click();
    	return assignedtask.isDisplayed();
    }
    
    	
    
//    
//    public void verify_employee_details(String empl) throws Exception, Error
//    {
//    	search(empl);
//    	Thread.sleep(1000);
//    	Actions act = new Actions(driver);
//    	act.doubleClick(emprowclick).build().perform();
//    	Thread.sleep(1000);
//    	vck.checkIsAvailable(emppersonalinfo);
//    	System.out.print("*******Employee Details*******");
//    	System.out.print(emppersonalinfo.getText()+"\n");
//    	System.out.print(empinfo.getText()+"\n");
//    	Assert.assertTrue(progressbar.isDisplayed(), "Employee Progress bar is displayed");
//    	System.out.print(projectlist.getText()+"\n");
//    }
//    public void verify_edit_employee(String empl2) throws Exception, Error
//    {
//    	search(empl2);
//    	action.click();
//    	editbutton.click();
//    	submit.click();
//    	Thread.sleep(5000);
//    	Assert.assertTrue(successupdate.isDisplayed());
//    	
// }
//  
//  
 /*---------------------------Delete an employee--------------------------*/  
  public void deleteuser() throws Exception, Error
  {
	searchicon.click();
	searchbar.sendKeys(prop.getProperty("value"));  
  	Thread.sleep(3000);
  	try {
  		    vck.checkIsAvailable(action);
		    action.click();
			vck.checkIsAvailable(delete);
			delete.click();
			delete_yes.click();
			searchicon.click();
			searchbar.sendKeys("Test");
			if(searchnoresult.isDisplayed()==true)
			{
				System.out.print("User trying to search has been deleted\n");
			}
			else
			{
				System.out.print("User is not deleted \n");
			}
		}
  	catch (Exception e) 
  	    {
			System.out.print("No such user found to delete \n");
		}
  }
//  
//  //Verify success message after user creation
//  public boolean usercreatedmessage()
//  {
//  	return successuser.isDisplayed();
//  }
//  
//  public void invalid_delete_attempt() throws Exception, Error
//  {
//  	vck.checkIsAvailable(action);
//  	try {
//			action.click();
//			vck.checkIsAvailable(deleteuser);
//			deleteuser.click();
//			driver.switchTo( ).alert( ).accept();
//			Thread.sleep(1000);
//			if(deleteuser.isDisplayed()==true)
//			{
//				System.out.print("Can not delete user. User linked with other modules\n");
//			}
//			else if (successuser.isDisplayed()==true)
//			{
//				System.out.print("User is Deleted\n");
//			}
//			else
//			{
//				System.out.print("Unknown Error occured");
//			}
//  	}
//			catch(Exception e)
//			{
//				
//			}
//  	}
    
    
    
    
}
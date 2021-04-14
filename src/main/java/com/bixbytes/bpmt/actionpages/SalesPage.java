package com.bixbytes.bpmt.actionpages;
import java.io.File;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.bixbytes.bpmt.base.TestBase;
import com.bixbytes.bpmt.commonmethods.VisibilityCheck;
import com.bixbytes.bpmt.utilities.TestDataReader;
import com.bixbytes.bpmt.utilities.Testutil;

public class SalesPage extends TestBase
{
	VisibilityCheck vck = new VisibilityCheck();
	Testutil tk = new Testutil();
	TestDataReader testdatareader;
	String[][] getUserData = null;
	
	/*--------------------------customer page locators----------------------------------*/
	
	@FindBy(xpath="//p[contains(text(),'Sales')]")
	WebElement sales;
	
	@FindBy(xpath="//a[@class='side-pd_menu router-link-exact-active active']")
	WebElement sales_menu;

	@FindBy(xpath="//a[contains(text(),'Customer List')]")
	WebElement customer_tab;
	
	@FindBy(xpath="//input[@id='company']")
	WebElement customername;
	
	@FindBy(xpath="//input[@id='street']")
	WebElement streetname;
	
	@FindBy(xpath="//input[@id='streetNo']")
	WebElement streetnumber;
	
	@FindBy(xpath="//input[@id='postCode']")
	WebElement postalcode;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='officeTel']")
	WebElement officetel;
	
	@FindBy(xpath="//input[@id='industry']")
	WebElement industry;
	
	@FindBy(xpath="//span[contains(text(),'Customer is required')]")
	WebElement customernameerror;
	
	@FindBy(xpath="//span[contains(text(),'Street is required')]")
	WebElement streetnameerror;
	
	@FindBy(xpath="//span[contains(text(),'Street No. is required')]")
	WebElement streetnoerror;
	
	@FindBy(xpath="//span[contains(text(),'Postal Code is required')]")
	WebElement postalcodeerror;
	
	@FindBy(xpath="//span[contains(text(),'City is required')]")
	WebElement cityerror;
	
	@FindBy(xpath="//span[contains(text(),'Country is required')]")
	WebElement countryerror;
	
	@FindBy(xpath="//span[contains(text(),'Industry is required')]")
	WebElement industryerror;
	
	@FindBy(xpath="//span[contains(text(),'Contact Person Name is required')]")
	WebElement contactpersonerror;
	
	@FindBy(xpath="//span[contains(text(),'Email is required')]")
	WebElement email_error;
	
	@FindBy(xpath="//span[contains(text(),'Details is required')]")
	WebElement details_error;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement savebutton;
	
	@FindBy(xpath="(//div[@class='search_bar'])[2]")
	WebElement searchicon;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement searchbutton;
	
	@FindBy(xpath="//div[contains(text(),'No records found')]")
	WebElement nosearchresult;
	
	@FindBy(xpath="//tr[@class='md-table-row']")
	WebElement searchrow;
	
	@FindBy(xpath="//span[contains(text(),'Successfully created')]")
	WebElement createcustomersuccess;
	
	@FindBy(xpath="//i[contains(text(),'delete')]")
	WebElement deleteicon;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-company mat-column-company ng-star-inserted']")
	WebElement newcustomer;
	
	@FindBy(xpath="//span[contains(text(),'Successfully deleted')]")
	WebElement deletesuccess;
	
	@FindBy(xpath="//td[@class='mat-cell cdk-column-customerNo mat-column-customerNo ng-star-inserted']")
	WebElement custid;
	
	@FindBy(xpath="//textarea[@formcontrolname='details']")
	WebElement details;
	
	@FindBy(xpath="//button[@class='primary-btn mat-flat-button mat-primary']")
	WebElement save;
	
	@FindBy(xpath="//span[contains(text(),'Successfully updated')]")
	WebElement updatemessage;
	
	@FindBy(xpath="//span[@class='mat-slide-toggle-content']")
	WebElement custstatus;
	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-thumb'])")
	WebElement custtoggle;
	
	@FindBy(xpath="//span[contains(text(),'Status changed successfully.')]")
	WebElement statusmessage;
	
	@FindBy(xpath="//div[@class='mat-slide-toggle-bar']")
	WebElement toggle;
	
	@FindBy(xpath="(//button[@class='ml-auto mb-2 float-right mat-button mat-primary'])[1]")
	WebElement addcontactbutton;
	
	@FindBy(xpath="//input[@formcontrolname='designation']")
	WebElement designation;
	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-thumb'])[2]")
	WebElement logintoggle;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement contactsave;
	
	@FindBy(xpath="//span[contains(text(),'Contact created!')]")
	WebElement contactsuccess;
	
	@FindBy(xpath="//input[@formcontrolname='firstName']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submitbutton;
	
	@FindBy(xpath="//span[contains(text(),'Contact created!')]")
	WebElement consuccess;
	
	@FindBy(xpath="//div[contains(text(),'Add Customer')]")
	WebElement addcustomer;
	
	@FindBy(xpath="(//div[contains(text(),'Add')])[5]")
	WebElement add_button;
	
	@FindBy(xpath="//span[@class='md-list-item-text']")
	List <WebElement> dropdown;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailaddress;
	
	@FindBy(xpath="//textarea[@name='details']")
	WebElement textarea;
	
	@FindBy(xpath="//input[@id='contact']")
	WebElement contactname;
	
	@FindBy(xpath="//span[contains(text(),'Customer2021')]")
	WebElement searchtext;
	
	@FindBy(xpath="(//div[@class='md-button-content'])[18]")
	WebElement actionellipse;
	
	@FindBy(xpath="//*[@id=\"delete-modal___BV_modal_footer_\"]/button[1]/div/div")
	WebElement deleteconfirm;
	
	@FindBy(xpath="//span[contains(text(),'EDIT')]")
	WebElement customeredit;
	/*----------------------------opportunity locators------------------------------------*/
	
	@FindBy(xpath="//a[contains(text(),'Opportunities')]")
	WebElement opportunity_tab;
	
	@FindBy(xpath="//div[contains(text(),' Add Opportunity ')]")
	WebElement addopportunity;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement opportunity_name;
	
	@FindBy(xpath="//input[@id=\"dueDate\"]")
	WebElement opportunity_duedate;
	
	@FindBy (xpath="(//div[@class=\"vd-picker__controls-label\"]/button)[1]")
	WebElement monthname;
	
	@FindBy(xpath="//input[@name='customer']")
	WebElement opportunity_customer;
	
	@FindBy(xpath="//span[@class='md-list-item-text']")
	List <WebElement> opportunity_dropdown;
	
	@FindBy(xpath="//input[@name=\"contact\"]")
	WebElement opportunity_contact;
	
	@FindBy(xpath="//input[@id=\"budget\"]")
	WebElement opportunity_budget;
	
	@FindBy(xpath="//input[@name=\"chance\"]")
	WebElement opportunity_chance;
	
	@FindBy(xpath="//textarea[@id=\"details\"]")
	WebElement opportunity_details;
	
	@FindBy(xpath="(//div[contains(text(),'Add')])[5]")
	WebElement opportunity_save;
	
	@FindBy(xpath="")
	WebElement opportunity_success;
	
	@FindBy(xpath="(//span[@class='vd-icon'])[2]")
	WebElement rightarrow;
	
	@FindBy(xpath="(//span[@class='vd-icon'])[1]")
	WebElement leftarrow;
	
	@FindBy(xpath="(//div[@class='vd-picker__controls-label']/button)[1]")
	WebElement opp_current_month;
	
	@FindBy(xpath="(//div[@class='vd-picker__controls-label']/button)[2]")
	WebElement opp_current_year;
	
	@FindBy(xpath="//div[@class='vd-picker__selects-months__button']/button")
	List <WebElement> opp_month;
	
	@FindBy(xpath="//button[@class='vd-picker__table-day']")
	List <WebElement> opp_days;
	
	@FindBy(xpath="(//div[@class='md-button-content'])[3]")
	WebElement exportbutton;
	
	@FindBy (xpath="//span[contains(text(),'Export to Excel')]")
	WebElement exporttoexcel;
	
	@FindBy (xpath="//span[contains(text(),'Export to PDF')]")
	WebElement exporttopdf;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement opportunitystatus;
	
	@FindBy(xpath="")
	WebElement opportunity_filter_apply;
	
	@FindBy(xpath="//span[contains(text(),'Opportunity Name is required')]")
	WebElement opportunity_nameerror;
	
	@FindBy(xpath="//span[contains(text(),'Due Date is required')]")
	WebElement opportunity_duedate_error;
	
	@FindBy(xpath="//span[contains(text(),'Customer is required')]")
	WebElement opportunity_custerror;
	
	@FindBy(xpath="//span[contains(text(),'Contact is required')]")
	WebElement opportunity_contact_error;
	
	@FindBy(xpath="//span[contains(text(),'Budget is required')]")
	WebElement budget_error;
	
	@FindBy(xpath="//span[contains(text(),'Chance is required')]")
	WebElement chance_error;
	
	@FindBy(xpath="//span[contains(text(),'Details is required')]")
	WebElement opportunity_details_error;
	
	@FindBy(xpath="//span[@class='user_name text_primary']")
	WebElement usernamerow;
	
	@FindBy(xpath="(//div[@class=\"md-button-content\"])[8]")
	WebElement opportunity_action_ellipses;
	
	@FindBy(xpath="//span[contains(text(),'EDIT')]")
	WebElement edit;
	
	@FindBy(xpath="//span[contains(text(),'DELETE')]")
	WebElement delete;
	
	@FindBy(xpath="//div[@class='md-button-content'][contains(text(),'Yes, I'm sure')]")
	WebElement delete_yes;
	
	@FindBy(xpath="(//div[@class='md-table-cell-container'])[5]")
	WebElement budget_value;
	
	@FindBy(xpath="(//div[@class='md-table-cell-container'])[6]")
	WebElement chance_value;
	
	@FindBy(xpath="//div[contains(text(),\"Update\")]")
	WebElement opportunity_update;
	
	@FindBy(xpath="//input[@name='responsibility']")
	WebElement responsible;
	
	/*--------------------------Meeting page locators------------------------------*/
	
	@FindBy(xpath="//a[contains(text(),'Meetings')]")
	WebElement meetings_tab;
	
	@FindBy(xpath="(//div[@class='md-button-content'])[6]")
	WebElement addmeeting;
	
	@FindBy(xpath="//input[@id='date']")
	WebElement meetingduedate;
	
	@FindBy(xpath="(//div[@class='md-radio-container'])[2]")
	WebElement meeting_call;
	
	@FindBy(xpath="(//div[@class='md-radio-container'])[1]")
	WebElement meeting_inperson;
	
	@FindBy(xpath="//input[@name='customer-meeting']")
	WebElement meeting_customer;
	
	@FindBy(xpath="//input[@name='responsibility']")
	WebElement meeting_responsibility;
	
	@FindBy(xpath="//input[@name='status-meeting']")
	WebElement meeting_status;
	
	@FindBy(xpath="//span[@class='md-list-item-text']")
	WebElement meeting_dropdown;
	
	@FindBy(xpath="//textarea[@class='md-textarea']")
	WebElement meeting_details;
	
	@FindBy(xpath="(//div[contains(text(),'Add')])[5]")
	WebElement meeting_add;
	
	@FindBy(xpath="(//div[@class='md-button-content'])[3]")
	WebElement exportbuttonmeeting;
	
	@FindBy (xpath="//span[contains(text(),'Export to Excel')]")
	WebElement exporttoexcelmeeting;
	
	@FindBy (xpath="//span[contains(text(),'Export to PDF')]")
	WebElement exporttopdfmeeting;
	
	@FindBy(xpath="//img[@class='cursor-pointer filter_icon']")
	WebElement meetingfilter;
	
	@FindBy(xpath="")
	WebElement meetingstatusfilter;
	
	@FindBy(xpath="")
	WebElement meetingedit;
	
	@FindBy(xpath="")
	WebElement meetingdelete;
	
	@FindBy(xpath="")
	WebElement meetingellipse;
	
	@FindBy(xpath="")
	WebElement meetingsearch;
	
	@FindBy(xpath="")
	WebElement meeting_search_result;
	
	@FindBy(xpath="//span[contains(text(),'Date is required')]")
	WebElement meeting_date_error;
	
	@FindBy(xpath="//span[contains(text(),'Customer is required')]")
	WebElement meeting_customer_error;
	
	@FindBy(xpath="//span[contains(text(),'Responsible is required')]")
	WebElement meeting_responsible_error;
	
	@FindBy(xpath="//span[contains(text(),'Status is required')]")
	WebElement meeting_status_error;
	
	@FindBy(xpath="//span[contains(text(),'Details is required')]")
	WebElement meeting_details_error;
	
	
	/*-------------------------Todo page locators----------------------------------*/
	
	@FindBy(xpath="//a[contains(text(),\"Todo List\")]")
	WebElement todo_tab;

	@FindBy(xpath="//div[contains(text(),'Add Todo')]")
	WebElement addtodo;
	
	/*-----------------------------Constructor--------------------------------------*/
	
	public SalesPage()
	{
		PageFactory.initElements(driver, this);
		testdatareader = new TestDataReader();
	}
	
	/*----------------------------Navigate to sales page----------------------------*/
	
	public boolean gotosalespage() throws Exception, Error
	{
		vck.checkIsAvailable(sales);
		sales.click();
		return sales_menu.isDisplayed();
	}
	
	/*---------------------------Navigate to opportunity pag----------------------*/
	public boolean verifyopportunitypage()
	{
		return opportunity_tab.isDisplayed();
	}
	
	/*--------------------------Navigate to customer page-------------------------*/
	public boolean verifycustomerpage() throws Exception, Error
	{
		vck.checkIsAvailable(customer_tab);
		customer_tab.click();
		return customer_tab.isDisplayed();
	}
	
	/*---------------------------Navigate to ToDo page----------------------------*/
	public boolean verifytodopage()
	{
		todo_tab.click();
		return todo_tab.isDisplayed();
	}
	
	/*---------------------------Navigate to Meetings page----------------------------*/
	public boolean verifymeetingspage()
	{
		meetings_tab.click();
		return meetings_tab.isDisplayed();
	}
	
	
	/*---------------------------Invalid search----------------------------*/
	public String Invalidsearchlist(String sheetname) throws Exception, Error
	{
		getUserData = testdatareader.getcelldata(sheetname);
		vck.checkIsAvailable(searchicon);
		searchicon.click();
		vck.checkIsAvailable(searchbutton);
		searchbutton.sendKeys(getUserData[1][0]);
		return nosearchresult.getText();
	}
	/*---------------------------Add opportunity input fields----------------------------*/
	public void addopportunity_textfields(String sheetname) throws Exception, Error
	{
		getUserData = testdatareader.getcelldata(sheetname);
		vck.checkIsAvailable(sales);
		sales.click();
		vck.checkIsAvailable(addopportunity);
		addopportunity.click();
		opportunity_name.sendKeys(getUserData[1][0]);
		opportunity_budget.sendKeys(getUserData[1][3]);
		opportunity_chance.sendKeys(getUserData[1][4]);
		opportunity_details.sendKeys(getUserData[1][5]);
		
	}
	public void select_responsible()
	{
		responsible.click();
		 for (int x=0; x<55; x++)
			{
			 for (WebElement cust:opportunity_dropdown)
			 {
			   if(cust.getText().equals("Admin Bix"))
			    {
				   cust.click();
				   return;
			    }
			 }
			}
		
	}

	/*---------------------------Select customer for opportunity----------------------------*/
	public void select_customer_for_opportunity() throws Exception
	{
		opportunity_customer.click();
		Thread.sleep(2000);
		 for (int x=0; x<55; x++)
			{
			 for (WebElement cust:opportunity_dropdown)
			 {
			   if(cust.getText().equals(prop.getProperty("company")))
			    {
				   cust.click();
				   return;
			    }
			 }
			}
	}
	/*---------------------------Select contact for opportunity----------------------------*/
	public void select_contact_for_opportunity() throws Exception
	{
		 opportunity_contact.click();
		 Thread.sleep(2000);
		 for (int y=0; y<55; y++)
			{
			 for (WebElement cont:opportunity_dropdown)
			 {
			   if(cont.getText().equals(prop.getProperty("name2")))
			    {
				   cont.click();
				   return;
			    }
			 }
			}
	}
	/*---------------------------Select due date for opportunity----------------------------*/
	public void select_duedate_opportunity() throws Exception
	{
		opportunity_duedate.click();
		Thread.sleep(2000);
		monthname.click();
		Thread.sleep(2000);
		 for (int j=0; j<12; j++)
			{
				for (WebElement m:opp_month)
				{
					if(m.getText().equals("Jul"))
					{
						m.click();
						Thread.sleep(3000);
						for (int i=0; i<opp_days.size();i++)
						{
							for (WebElement d:opp_days)
							{ 
							 if(d.getText().equals("9"))
							 {
								 d.click();
								 Thread.sleep(3000);
								 return;
								 
							 }
							}
					    }
					}
				}  
			
			}
	}
	/*---------------------------Click on add button to save opportunity----------------------------*/
    public void save_opportunty()
    {
    	opportunity_save.click();
    }
			 
    /*---------------------------Empty opportunity name error message verification ------------------*/		 
    public String opportunity_name_error() 
    {
    	return opportunity_nameerror.getText();
    }
    /*---------------------------Empty opportunity duedate error message verification ------------------*/		
    public String opportunity_duedateerror()
    {
    	return opportunity_duedate_error.getText();
    }
    /*---------------------------Empty opportunity customer error message verification ------------------*/		
    public String opportunity_customer_error()
    {
    	return opportunity_custerror.getText();
    }
    /*---------------------------Empty opportunity contact error message verification ------------------*/		
    public String opportunity_contacterror()
    {
    	return opportunity_contact_error.getText();
    }
    /*---------------------------Empty opportunity budget error message verification ------------------*/		
    public String opportunity_budget_error()
    {
    	return budget_error.getText();
    }
    /*---------------------------Empty opportunity chance error message verification ------------------*/		
    public String opportunity_chance_error()
    {
    	return chance_error.getText();
    }
    /*---------------------------Empty opportunity details error message verification ------------------*/		
    public String opportunity_detailserror()
    {
    	return opportunity_details_error.getText();
    }
    /*---------------------------Add opportunity button click method ------------------*/		
    public void add_opportunity()
    {
    	addopportunity.click();
    }
    
    /*--------------------------Success message after adding opportunity------------------*/		
	public boolean successmessagecust()
	{
		return createcustomersuccess.isDisplayed();
	}
	
	/*---------------------------Common Valid Search method ------------------*/		
	public String search(String sheetname, int row, int col) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname);
		searchicon.click();
		searchbutton.sendKeys(getUserData[row][col]);
		Thread.sleep(2000);
		return usernamerow.getText();	
	}
	/*---------------------------Common method to verify search result------------------*/		
	public String searchvalue(String sheetname, int row, int col) throws Exception
	{
		Thread.sleep(2000);
		getUserData = testdatareader.getcelldata(sheetname);
		return getUserData[row][col];
	}
	/*---------------------------Update opportunity----------------------------------*/
	public void updateopportunity(String sheetname) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname);
		vck.checkIsAvailable(searchicon);
		searchicon.click();
		searchbutton.sendKeys(getUserData[1][0]);
		Thread.sleep(2000);
		opportunity_action_ellipses.click();
		edit.click();
		opportunity_budget.clear();
		Thread.sleep(2000);
		opportunity_budget.sendKeys(getUserData[2][3]);
		opportunity_chance.clear();
		opportunity_chance.sendKeys(Keys.CLEAR);
		opportunity_chance.sendKeys(getUserData[2][4]);
		Thread.sleep(2000);
		opportunity_update.click();
		Thread.sleep(2000);
		Assert.assertEquals(budget_value.getText(), getUserData[2][3]);
		Assert.assertEquals(chance_value.getText(), getUserData[2][4] +" %");
	}
	
	/*---------------------------Delete opportunity----------------------------------*/	
	public void deleteopportunity(String sheetname) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname);
		Thread.sleep(3000);
		searchicon.click();
		searchbutton.sendKeys(getUserData[1][0]);
		Thread.sleep(2000);
		opportunity_action_ellipses.click();
		Thread.sleep(3000);
		delete.click();
		deleteconfirm.click();
		Assert.assertTrue(nosearchresult.isDisplayed());	
	}

    public void navigate_to_customeradd_page() throws Exception, Error
    {
    	customer_tab.click();
    	Thread.sleep(3000);
    	addcustomer.click();
    	Thread.sleep(3000);
    }
    
    public boolean customer_email_error()
    {
    	return email_error.isDisplayed();
    }
    
    public boolean customer_name_error()
    {
    	return customernameerror.isDisplayed();
    }
    
    public boolean customer_contact_error()
    {
    	return contactpersonerror.isDisplayed();
    }
    
    public boolean customer_street_error()
    {
    	return streetnameerror.isDisplayed();
    }
    
    public boolean customer_street_no_error()
    {
    	return streetnoerror.isDisplayed();
    }
    
    public boolean customer_postal_code_error()
    {
    	return postalcodeerror.isDisplayed();
    }
    
    public boolean customer_city_error()
    {
    	return cityerror.isDisplayed();
    }
    
    public boolean customer_industry_error()
    {
    	return industryerror.isDisplayed();
    }
    
    public boolean customer_country_error()
    {
    	return countryerror.isDisplayed();
    }
    
    public boolean customer_details_error()
    {
    	return details_error.isDisplayed();
    }
    public void deletecust(String sheetname) throws Exception, Error
    {
		getUserData = testdatareader.getcelldata(sheetname);
		searchicon.click();
		searchbutton.sendKeys(getUserData[1][0]);
		Thread.sleep(2000);
		actionellipse.click();
		delete.click();
		Thread.sleep(3000);
		deleteconfirm.click();
		Assert.assertTrue(nosearchresult.isDisplayed());	
    }
    public void edit_customer(String sheetname) throws Exception, Error
    {
    	getUserData = testdatareader.getcelldata(sheetname);
    	searchicon.click();
		searchbutton.sendKeys(getUserData[1][1]);
		Thread.sleep(5000);
    	customeredit.click();
    	textarea.sendKeys(getUserData[1][0]);
    	save.click();
    }
    
    private File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	
	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
    public void verify_downloaded_file()
    {
    	File getLatestFile = getLatestFilefromDir(prop.getProperty("downloadpath"));
	    String fileName = getLatestFile.getName();
	    System.out.println("The downloaded file is\t" +fileName);
	    if(getLatestFile.exists())
	    {
	    getLatestFile.delete();
	    }
    }
    
    public void export_pdf() throws Exception, Error
    {
    	exportbutton.click();
    	vck.checkIsAvailable(exporttopdf);
    	exporttopdf.click();
    	Thread.sleep(5000);
    	verify_downloaded_file();
    }
    
    public void export_excel() throws Exception, Error
    {
    	exportbutton.click();
    	vck.checkIsAvailable(exporttoexcel);
    	exporttoexcel.click();
    	Thread.sleep(5000);
    	verify_downloaded_file();
    	
    }
    
    public void select_country()
    {
    	 for (int x=0; x<55; x++)
			{
			 for (WebElement cust1:dropdown)
			 {
			   if(cust1.getText().equals(prop.getProperty("country")))
			    {
				   cust1.click();
				   return;
			    }
			 }
			}
    	
    }
    
    public void add_new_customer_and_search(String sheetname) throws Exception
    {
    	addcustomer.click();
    	getUserData = testdatareader.getcelldata(sheetname);
    	customername.sendKeys(getUserData[1][0]);
    	streetname.sendKeys(getUserData[1][2]);
    	streetnumber.sendKeys(getUserData[1][3]);
    	postalcode.sendKeys(getUserData[1][4]);
    	city.sendKeys(getUserData[1][5]);
    	officetel.sendKeys(getUserData[1][6]);
    	industry.sendKeys(getUserData[1][7]);
    	emailaddress.sendKeys(randomestring()+getUserData[1][8]);
    	textarea.sendKeys(getUserData[1][9]);
    	contactname.sendKeys(getUserData[1][10]);
    	country.click();
    	select_country();
    	Thread.sleep(2000);
    	add_button.click();
    	Thread.sleep(7000);
    	searchicon.click();
    	searchbutton.sendKeys(getUserData[1][0]);
    	Thread.sleep(5000);
    	Assert.assertTrue(searchtext.isDisplayed()); 	
    }
    
    public void customer_add_popup()
    {
    	addcustomer.click();
    	add_button.click();
    }
    
    public void meeting_add_pop()
    {
    	addmeeting.click();
    	meeting_add.click();
    }
    public void select_customer_for_meeting() throws Exception
  	{
  		meeting_customer.click();
  		Thread.sleep(2000);
  		 for (int x=0; x<55; x++)
  			{
  			 for (WebElement cust:opportunity_dropdown)
  			 {
  			   if(cust.getText().equals(prop.getProperty("company")))
  			    {
  				   cust.click();
  				   return;
  			    }
  			 }
  			}
  	}
      public void select_duedate_meeting() throws Exception
  	{
  		meetingduedate.click();
  		Thread.sleep(2000);
  		monthname.click();
  		Thread.sleep(2000);
  		 for (int j=0; j<12; j++)
  			{
  				for (WebElement m:opp_month)
  				{
  					if(m.getText().equals("Jul"))
  					{
  						m.click();
  						Thread.sleep(3000);
  						for (int i=0; i<opp_days.size();i++)
  						{
  							for (WebElement d:opp_days)
  							{ 
  							 if(d.getText().equals("9"))
  							 {
  								 d.click();
  								 Thread.sleep(3000);
  								 return;
  								 
  							 }
  							}
  					    }
  					}
  				}  
  			
  			}
  	}
     public void select_meeting_status() throws Exception
      {
    	  meeting_status.click();
    	  Thread.sleep(2000);
   		 for (int x=0; x<55; x++)
   			{
   			 for (WebElement st:dropdown)
   			 {
   			   if(st.getText().equals(prop.getProperty("status")))
   			    {
   				   st.click();
   				   return;
   			    }
   			 }
   			}
      }
    public void add_new_call_meeting_and_search(String sheetname) throws Exception
    {
    	addmeeting.click();
    	getUserData = testdatareader.getcelldata(sheetname);
    	meeting_call.click();
    	select_duedate_meeting();
    	select_customer_for_meeting();
    	select_responsible();
    	select_meeting_status();
    	meeting_details.sendKeys(getUserData[1][2]);
    	meeting_add.click();
    	Thread.sleep(7000);
    	searchicon.click();
    	searchbutton.sendKeys(getUserData[1][2]);
    	Thread.sleep(5000);
    	Assert.assertTrue(searchtext.isDisplayed()); 	

}
    public boolean meeting_date_error()
    {
    	return meeting_date_error.isDisplayed();
    }
  
    public boolean meeting_customer_error()
    {
    	return meeting_customer_error.isDisplayed();
    }
    public boolean meeting_responsible_error()
    {
    	return meeting_responsible_error.isDisplayed();
    }
    public boolean meeting_status_error()
    {
    	return meeting_status_error.isDisplayed();
    }
    public boolean meeting_details_error()
    {
    	return meeting_details_error.isDisplayed();
    }
    
    public void deletemeeting(String sheetname) throws Exception
	{
		getUserData = testdatareader.getcelldata(sheetname);
		Thread.sleep(3000);
		searchicon.click();
		searchbutton.sendKeys(getUserData[1][0]);
		Thread.sleep(2000);
		actionellipse.click();
		delete.click();
		Thread.sleep(3000);
		deleteconfirm.click();
		Assert.assertTrue(nosearchresult.isDisplayed());
}
    public void add_new_inperson_meeting_and_search(String sheetname) throws Exception
    {
    	addmeeting.click();
    	getUserData = testdatareader.getcelldata(sheetname);
    	meeting_inperson.click();
    	select_duedate_meeting();
    	select_customer_for_meeting();
    	select_responsible();
    	select_meeting_status();
    	meeting_details.sendKeys(getUserData[1][2]);
    	meeting_add.click();
    	Thread.sleep(7000);
    	searchicon.click();
    	searchbutton.sendKeys(getUserData[1][2]);
    	Thread.sleep(5000);
    	Assert.assertTrue(searchtext.isDisplayed()); 	
}
}
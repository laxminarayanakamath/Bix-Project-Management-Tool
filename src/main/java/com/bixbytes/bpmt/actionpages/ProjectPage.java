package com.bixbytes.bpmt.actionpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bixbytes.bpmt.base.TestBase;
import com.bixbytes.bpmt.commonmethods.VisibilityCheck;
import com.bixbytes.bpmt.utilities.Testutil;

public class ProjectPage extends TestBase
{
	VisibilityCheck vck = new VisibilityCheck();
	Testutil tk = new Testutil();
	
	public ProjectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*Project Listing Page*/
	
	@FindBy (xpath="")
	WebElement projectmenu;
	
	@FindBy(xpath="")
	WebElement addproject;
	
	@FindBy(xpath="")
	WebElement projectsearchicon;
	
	@FindBy(xpath="")
	WebElement projectfilter;
	
	@FindBy(xpath="")
	WebElement projectsearchbar;
	
	@FindBy(xpath="")
	WebElement projectnoresult;
	
	@FindBy(xpath="")
	WebElement actionellipse;
	
	@FindBy(xpath="")
	WebElement editproject;
	
	@FindBy(xpath="")
	WebElement addmilestone;
      
	@FindBy(xpath="")
	WebElement addsprint;

	@FindBy(xpath="")
	WebElement addtask;
	
	@FindBy(xpath="")
	WebElement addmember;
	
	@FindBy(xpath="")
	WebElement deleteproject;
	
	@FindBy(xpath="")
	WebElement delete_yes;
	
	
	/*Add Project locators */
	
	@FindBy(xpath="")
	WebElement projectcategory;
	
	@FindBy (xpath="")
	WebElement projectname;
	
	@FindBy(xpath="")
	WebElement startdate;
	
	@FindBy(xpath="")
	WebElement estimatedhours;
	
	@FindBy (xpath="")
	WebElement customername;
	
	@FindBy(xpath="")
	WebElement projectcode;
	
	@FindBy(xpath="")
	WebElement projectdescription;
	
	@FindBy (xpath="")
	WebElement enddate;
	
	@FindBy(xpath="")
	WebElement projectlead;
	
	@FindBy(xpath="")
	WebElement projettype;
	
	@FindBy (xpath="")
	WebElement submitproject;
	
	@FindBy(xpath="")
	WebElement cancelproject;
	
	@FindBy(xpath="")
	WebElement customererror;
	
	@FindBy (xpath="")
	WebElement estimatedhourerror;
	
	@FindBy(xpath="")
	WebElement projectleaderror;
	
	@FindBy(xpath="")
	WebElement dateerror;
	
	@FindBy (xpath="")
	WebElement projectcreatedsuccessmsg;
	
	@FindBy(xpath="")
	WebElement projectaddfailuremsg;
	
	@FindBy(xpath="")
	WebElement projectexistsmsg;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

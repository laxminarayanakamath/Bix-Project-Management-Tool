package com.bixbytes.bpmt.actionpages;

import org.openqa.selenium.Keys;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bixbytes.bpmt.base.TestBase;
import com.bixbytes.bpmt.commonmethods.VisibilityCheck;
import com.bixbytes.bpmt.utilities.TestDataReader;
import com.bixbytes.bpmt.utilities.Testutil;


public class LoginPage extends TestBase
{
TestDataReader testdatareader;	
VisibilityCheck vck = new VisibilityCheck();
Testutil tk = new Testutil();
String[][] getUserData = null;

/*--------------Login Locators-------------------- */	

@FindBy(xpath="(//input[@class='md-input'])[1]") 
WebElement username;

@FindBy(xpath="(//input[@class='md-input'])[2]")
WebElement password;

@FindBy (xpath="//div[contains(text(),'Login')]")
public
WebElement loginbutton;

@FindBy (xpath="//div[contains(text(),' Invalid Credentials ')]")
WebElement loginerror;

@FindBy (xpath="//span[contains(text(),'The E-mail field is required')]")
WebElement emailerror;

@FindBy (xpath="//span[contains(text(),'The Password field is required')]")
WebElement passworderror;

@FindBy (xpath = "//img[@class='img-fluid bmpt_logo']")
WebElement bixlogo;

@FindBy (css="#sideBarToggle > div > div.header.side-pd.brandLogo > svg > g > g")
WebElement logoafterlogin;

@FindBy (xpath=" //p[@class=\"bpmtlogin_name\"]")
public WebElement nameofuser;


/*--------------Logout Locators------------------------*/

@FindBy (xpath="//div[@class='profile']")
WebElement rightmenu;

@FindBy(xpath="//span[contains(text(),'Logout')]")
WebElement logout;

/*--------------Forgot Password-------------------------*/

@FindBy (xpath="//a[contains(text(),'Forgot Password?')]")
WebElement forgotpassword;

@FindBy (xpath="//input[@class='md-input']")
WebElement forgot_email;

@FindBy (xpath="//div[contains(text(),'Submit')]")
WebElement submit;

@FindBy (xpath="//a[contains(text(),'Sign-In')]")
WebElement backtologin;

@FindBy (xpath="//div[contains(text(),' Email not found in our records! ')]")
WebElement verifyemailerror2;

@FindBy (xpath="//div[contains(text(),' Reset password link sent on your email id. ')]")
WebElement resetmessage;

/*------------------LoginPage--Constructor-----------------------------------*/

public LoginPage()
{
	PageFactory.initElements(driver, this);
	testdatareader = new TestDataReader();
}

/* Email field error message */
public boolean verifyemailerror()
{
	 return emailerror.isDisplayed();
}

/* Get page title */
 public String validateloginpagetitle()
 {
	return driver.getTitle();
 }
 
/* Verify login button is displayed or not */ 
public boolean loginbuttonisdisplayed()
{
	return loginbutton.isDisplayed();
}

/* Verify BPMT logo in login page */

 public boolean verifybixlogo()
 {
	 return bixlogo.isDisplayed();
 }
 
 /* Verify invalid login error message */
 
 public boolean verifyloginerror()
 {

	 return loginerror.isDisplayed();
 }
 
 /* Verify BPMT Logo after login */
 public boolean verifyloginlogo()
 {
	 return logoafterlogin.isDisplayed();
 }
 
 
 /*Verify user's name is displayed as email is entered */
 
 public boolean verifynameofuser()
 {
	 return  nameofuser.isDisplayed();
 }
 
 
 public boolean resetemailmessage()
 {
	 return resetmessage.isDisplayed();
 }
 
 public boolean emailnotregistered()
 {
	 return verifyemailerror2.isDisplayed();
 }
 
 /*Login module*/
 
 public void login(String sheetname) throws Exception
 {
	 getUserData = testdatareader.getcelldata(sheetname);
	 vck.checkIsAvailable(username);
	 vck.checkIsAvailable(password);
	 username.sendKeys(getUserData[1][0]);
	 password.sendKeys(getUserData[1][1]);
	 if (loginbuttonisdisplayed()==true)
	 {
		 loginbutton.click();
	 }
	 else
	 {
		 System.out.print("Login button is disabled");
	 }
	 Thread.sleep(5000);
 }
 
/*Logout Module*/
 public void logout() throws Exception
 {
	 Thread.sleep(5000);
	 vck.checkIsAvailable(rightmenu);
	 rightmenu.click();
	 vck.checkIsAvailable(logout);
	 logout.click();
 }
 
 /*Invalid Email verification module*/
 public void enteremail(String em) throws Exception
 {
	 Thread.sleep(5000);
	 username.sendKeys(em);
	 username.sendKeys(Keys.TAB);
	 Thread.sleep(5000);
 }
 
 /*Forgot password module*/
 public void clickforgotpassword() throws Exception, Error
 {
	 vck.checkIsAvailable(forgotpassword);
	 forgotpassword.click();
 }
 
 /*Enter valid registered email address */
 public void enterforgotemail(String em) throws Exception, Error
 {
	 vck.checkIsAvailable(forgot_email);
	 forgot_email.sendKeys(em);
	 Thread.sleep(2000);
	 submit.click();
 }
 
 /* Clicking on sign in button */
 public void back_to_login() throws Exception, Error
 {
	 vck.checkIsAvailable(backtologin);
	 backtologin.click();
	 Assert.assertTrue(username.isDisplayed());
 }
 
 public boolean verify_empty_email_error()
 {
	 return emailerror.isDisplayed();
 }
 
 public boolean verify_empty_password_error()
 {
	 return passworderror.isDisplayed();
 }
 
}
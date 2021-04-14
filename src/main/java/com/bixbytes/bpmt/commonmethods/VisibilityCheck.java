package com.bixbytes.bpmt.commonmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bixbytes.bpmt.base.TestBase;


public class VisibilityCheck extends TestBase
{

public void checkIsAvailable(WebElement element) throws Error, InterruptedException
	
	{
        	WebDriverWait wt=new WebDriverWait(driver,8);
        	wt.until(ExpectedConditions.visibilityOf(element));
        	
        	if(element.isDisplayed()==true)
        	{
        		//logger.info("This element is displayed,proceeding with further actions..."+element);
        		System.out.print("Element available proceeding with further action....\n");
        	}
        
        	else
        	{
        	System.out.println("Element is not available - Method-checkIsAvailable\n");
        	//logger.info("Element is not available - Method-checkIsAvailable...");
        	}
        
	}
}

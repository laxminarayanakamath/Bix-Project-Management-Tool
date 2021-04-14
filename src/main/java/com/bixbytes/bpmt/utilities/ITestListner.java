
package com.bixbytes.bpmt.utilities;

import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.internal.IResultListener2;

public class ITestListner implements ITestListener
{
WebDriver driver;
Takescreenshot t = new Takescreenshot();
	public void onFinish(ITestContext tcname) 
	{
		System.out.println("Completed running testcases....");
	}

	public void onStart(ITestContext tcname) {

		System.out.println("Testcases Running Started....");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{

	}

	public void onTestFailure(ITestResult tcname) 
	{

		String testcasename = tcname.getMethod().getMethodName();
		try {
			driver=(WebDriver) tcname.getTestClass().getRealClass().getField("driver").get(tcname.getInstance());
			try {
				t.screenshot(testcasename,driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("FAILED TEST:" + testcasename);

	}

	public void onTestSkipped(ITestResult tcname) {
		String testcasename = tcname.getMethod().getMethodName();
		System.out.println("Below Test is Skipped:" + testcasename);

	}

	public void onTestStart(ITestResult tcname) {
		String testcasename = tcname.getMethod().getMethodName();
		System.out.println("Below  Test is Started:" + testcasename);

	}

	public void onTestSuccess(ITestResult tcname) {

		String testcasename = tcname.getMethod().getMethodName();
		try {
			driver=(WebDriver) tcname.getTestClass().getRealClass().getField("driver").get(tcname.getInstance());
			try {
				t.screenshot(testcasename,driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PASSED TEST:" + testcasename);

	}
}

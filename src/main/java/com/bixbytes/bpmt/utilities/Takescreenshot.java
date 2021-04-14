package com.bixbytes.bpmt.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bixbytes.bpmt.base.TestBase;

import org.apache.commons.io.FileUtils;

public class Takescreenshot extends TestBase
{
	
	public void screenshot(String testcasename,WebDriver dr) throws IOException
	{
	 
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	
    TakesScreenshot scrShot =((TakesScreenshot)dr);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    //LocalDateTime dt=LocalDateTime.now();
    String screenshotname=testcasename+timeStamp+".png";
    File DestFile=new File(System.getProperty("user.dir") + "/test-output/Screenshots/"+screenshotname);
    FileUtils.copyFile(SrcFile, DestFile);
	
	}

}

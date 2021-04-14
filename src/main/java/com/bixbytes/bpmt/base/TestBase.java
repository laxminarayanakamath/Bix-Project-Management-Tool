package com.bixbytes.bpmt.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.bixbytes.bpmt.utilities.Testutil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	/*Constructor reading properties file*/
	
	public TestBase()
	{
		prop = new Properties();
		try 
		{
			FileInputStream ip = new FileInputStream("C:\\Users\\User\\git\\BPMT2\\BPMTool_OldV1\\src\\main\\java\\com\\bixbytes\\bpmt\\properties\\config.properties");
			try {
				prop.load(ip);
			    } 
			catch (IOException e)
			    {
				   e.printStackTrace();
			    }
	     } 
		catch (FileNotFoundException e) 
		 {
			e.printStackTrace();
		 } 
    }
    /*Browser initiation and URL launcher module*/
	
	public static WebDriver initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\BPMT2\\BPMTool_OldV1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\git\\BIXPMTOOL\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\git\\BIXPMTOOL\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Testutil.implict_wait, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url2"));
	    return driver;
	}

    /* General admin login module */
	
	public static void generallogin(String uname, String ps)
	{
		WebElement username=driver.findElement(By.xpath("(//input[@class='md-input'])[1]"));
		WebElement Pass=driver.findElement(By.xpath("(//input[@class='md-input'])[2]"));
		WebElement loginbutton = driver.findElement(By.xpath("//div[contains(text(),'Login')]"));
		username.sendKeys(uname);
		Pass.sendKeys(ps);
		loginbutton.click();
	}
	
    /* Random string generator for name, email etc */
	
	public String randomestring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(6);
		return (generatedstring);
	}
	
    /* Random number generator for phone/mobile */	

	public static String randomeNum() {
		String generatednum = RandomStringUtils.randomNumeric(9);
		return (generatednum);
	
	}

    /* Random alphanumeric character generator */
	
	public String alphanumeric()
	{
		String em = RandomStringUtils.randomAlphanumeric(6);
		return (em);
	}
	
	/* Random alphanumeric character generator for invalid cases */
	public String randomcharacters()
	{
		return (RandomStringUtils.randomAlphanumeric(17));
	}
	
}
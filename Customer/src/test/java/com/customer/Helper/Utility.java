package com.customer.Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utility {
	WebDriver driver;
	Properties prop;

	public void startBrowser(String browser) {
		// TODO Auto-generated constructor stub
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		// ******1-Allow, 2-Block, 0-default*****
		options.setExperimentalOption("prefs", prefs);
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\$elenium_Work$pace\\Customer\\chromedriver.exe");

			driver = new ChromeDriver(options);
			driver.get("https://www.virginaustralia.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
	}
	
	public Properties readPropertiesFile() throws IOException
	{
		FileInputStream fi = new FileInputStream(
				"D:\\$elenium_Work$pace\\Customer\\src\\dd_excel\\Util.properties");
		prop = new Properties();
		prop.load(fi);
		return prop;
		
	}
	public void type(String loc,String value)
	{
		driver.findElement(By.id("loc")).sendKeys("value");
		
	}
	public void click(String loc) 
	{
		driver.findElement(By.xpath("loc")).click();
	}
	
	public void closeBrowser() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}

}

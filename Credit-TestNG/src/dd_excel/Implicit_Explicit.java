package dd_excel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Implicit_Explicit {
	WebDriver driver;
	String title;
	Properties prop; 
	
	  @BeforeTest
	  public void beforeTest() throws IOException {
		  ChromeOptions options=new ChromeOptions();
			Map<String, Object> prefs=new HashMap<String,Object>();
			prefs.put("profile.default_content_setting_values.notifications", 1);
			//******1-Allow, 2-Block, 0-default*****
			options.setExperimentalOption("prefs",prefs);
			// Handle Browser Notifications
			
			FileInputStream fi = new FileInputStream(
					"D:\\$elenium_Work$pace\\Credit-TestNG\\src\\dd_excel\\Util.properties");
			prop = new Properties();
			prop.load(fi);
			prop.getProperty("SysSetup");
			driver = new ChromeDriver(options);
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

	  }

	@Test
  public void f() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium d");
		WebDriverWait ewait=new WebDriverWait(driver,50 );
		ewait.until(ExpectedConditions.elementToBeClickable(By.className("lsb")));
  }

  @AfterTest
  public void afterTest() {
  }

}

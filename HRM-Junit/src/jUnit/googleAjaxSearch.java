package jUnit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googleAjaxSearch {
	WebDriver driver;


	@Before
	public void setUp() throws Exception {

		// Handle Browser Notifications
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//******1-Allow, 2-Block, 0-default*****
		options.setExperimentalOption("prefs",prefs);
		// Handle Browser Notifications
		
		System.setProperty("webdriver.chrome.driver", "D:\\$elenium_Work$pace\\HRM\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium d");
		driver.findElement(By.xpath("(//div[@class='sbqs_c'])[2]")).click();
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@After
	public void tearDown() throws Exception {
	}


}

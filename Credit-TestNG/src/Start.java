import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class Start {
	WebDriver driver;
	String title;

	@BeforeTest
	public void beforeTest() {
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		//******1-Allow, 2-Block, 0-default*****
		options.setExperimentalOption("prefs",prefs);
		// Handle Browser Notifications
		
		System.setProperty("webdriver.chrome.driver", "D:\\$elenium_Work$pace\\Credit-TestNG\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(description="This is the Validate test method")
	public void Validate() throws InterruptedException {
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium d");
		driver.findElement(By.xpath("(//div[@class='sbqs_c'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='rc']/h3/a[contains(text(),'Downloads - Selenium')]")).click();
		Thread.sleep(2000);
		title=driver.getTitle().toString();
		System.out.println(title);
		
		
	}

	@AfterClass
	public void afterTest() {
		Assert.assertEquals(title,"Download");
	}

}

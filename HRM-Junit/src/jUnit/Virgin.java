package jUnit;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javafx.scene.control.Alert;

public class Virgin {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		// Handle Browser Notifications
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		// ******1-Allow, 2-Block, 0-default*****
		options.setExperimentalOption("prefs", prefs);
		// Handle Browser Notifications

		System.setProperty("webdriver.chrome.driver", "D:\\$elenium_Work$pace\\HRM\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.get("https://www.virginaustralia.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws InterruptedException {
		Actions actionBuilder = new Actions(driver);
		// driver.findElement(By.cssSelector("//input[@id='flights-oneway']")).click();
		driver.findElement(By.xpath("(//div[@class='lr-combined tripType']//label/span[@class='input'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='flights-originSurrogate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='frequent-routes-AU']/div[@class='route js-frequent-route-row'][1]/ul/li/a[@data-origin-name='Brisbane']"))
				.click();
		driver.findElement(By.id("flights-departure-date")).click();
		Thread.sleep(3000);
		
		Select monthSelect=new Select(driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all dialog-selectboxes virgin-date-selector flexible-with-dates']//select[@class='monthSelect cform left']")));
		monthSelect.selectByVisibleText("November 2018");
	
		Thread.sleep(2000);
		WebElement date=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='8']"));
		actionBuilder.moveToElement(date).click().build().perform();
		driver.findElement(By.id("flights-submit")).click();
		Thread.sleep(10000);

		// Actions command
		WebElement hover = driver.findElement(By.xpath(
				"//table[@class='flc-grp noheader']/tbody/tr[@class='yui-dt-odd']/td[@id='td-0-SG1-3']//span[contains(text(),'295.00')]"));

		
		actionBuilder.moveToElement(hover).click().build().perform();
		// div[contains(@id,'post-body'='flight_0_-1605569161')]"

	}

	@After
	public void tearDown() throws Exception {
	}

}

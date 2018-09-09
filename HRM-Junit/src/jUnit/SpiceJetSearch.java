package jUnit;

import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetSearch {
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\$elenium_Work$pace\\HRM\\chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("https://www.virginaustralia.com");
		Thread.sleep(3000);
	}

	@Test
	public void test() {
		System.out.println("vivek");
		/*driver.findElement(By.id("lst-ib")).sendKeys("Selenium HQ");
		driver.findElement(By.name("btnK")).click();
		
		String LinkText=driver.findElement(By.linkText("Selenium WebDriver")).getText();
	System.out.println("link text val="+LinkText);
	driver.findElement(By.linkText("Selenium WebDriver")).click();*/
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.close();
	}

}

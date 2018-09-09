package testabc;


import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Abc {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.geckodriver.driver","D:\\$elenium_Work$pace\\Test123\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.get("http://live.guru99.com");
		Thread.sleep(3000);
		/*WebElement link_Home= driver.findElement(By.name("MOBILE"));
		Actions builder = new Actions(driver);
        Action clickOnText = builder.moveToElement(link_Home).build();
	    clickOnText.perform();*/
		((Actions) driver.findElements(By.id("txtUsername"))).sendKeys("sdfgs");
		//driver.findElements(By.id("txtUsername")).sendKeys("vivek");
	}
}

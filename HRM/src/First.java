import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\$elenium_Work$pace\\HRM\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(3000);
		
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.id("btnLogin")).submit();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.className("firstLevelMenu")).click();
		/*WebElement pim_click_id = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions action=new Actions(driver);
		action.moveToElement(pim_click_id);
		action.click(pim_click_id);
		Action act=action.build();
		act.perform();*/
	}

}
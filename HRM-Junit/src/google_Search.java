import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\$elenium_Work$pace\\HRM\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium HQ");
		driver.findElement(By.name("btnK")).click();
		
		String LinkText=driver.findElement(By.linkText("Selenium WebDriver")).getText();
	System.out.println("link text val="+LinkText);
	driver.findElement(By.linkText("Selenium WebDriver")).click();
	}

}

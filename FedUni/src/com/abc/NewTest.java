package com.abc;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
//	int arr[]=new int[];
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
		driver.get("https://fdlgrades.federation.edu.au");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
  }
  @Test
 
	  public void f() throws Exception {
	
		  FileInputStream fi=new FileInputStream("C:\\Users\\Vik\\Desktop\\excel.xls");
		  Workbook wb=Workbook.getWorkbook(fi);
		  Sheet s=wb.getSheet("Sheet1");
	
		  for (int i = 0; i < s.getRows(); i++) {
			  System.out.println("");
			  for (int j = 0; j < s.getColumns(); j++) {
				 System.out.print(s.getCell(j,i).getContents()+"|");
			
			}
			
		}
	
		  Thread.sleep(3000);
		  driver.findElement(By.name("txtUsername")).sendKeys("kpadala");
		  driver.findElement(By.name("txtPassword")).sendKeys("nithyasn12$");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.name("btnSubmit")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  //driver.findElement(By.name("btnGo")).click();
		  //driver.findElement().click(By.link("//tr/td/a[contains(text(),'Student')]"));
		 /* WebElement pim_click_id = driver.findElement(By.xpath("//tr/td/a[contains(text(),'Student')]"));
			Actions action=new Actions(driver);
			action.moveToElement(pim_click_id);
			action.click(pim_click_id);
			Action act=action.build();
			act.perform();*/
		  driver.switchTo().frame("fmeMenu");
		  driver.findElement(By.linkText("Student")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  //driver.switchTo().window("fdlGrades --> Federation University Australia --> Student");
		 // driver.switchTo().
		 // System.out.println(driver.getTitle());
		  Set<String> windows = driver.getWindowHandles();

          for (String window : windows) {
              driver.switchTo().window(window);
              if (driver.getTitle().contains("fdlGrades --> Federation University Australia --> Student")) {
            	  driver.findElement(By.name("txtstudentid")).sendKeys("30089795");
            	  driver.findElement(By.name("btnGo")).click();
                  return;
              }
          }
		  
		 
  }
  @AfterTest
  public void afterTest() {
  }

}

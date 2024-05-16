package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class orangehrmexer {
	
	WebDriver driver;
@BeforeTest(alwaysRun=true)
	
	public void openweb() {
		

        driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


//@Test
//public void orangehrm() {
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
////	driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
////	driver.findElement(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon")).click();
//	
//}
//
//
//@AfterTest(alwaysRun=true)
//public void teardown() {
//	driver.close();
//}
//	
}

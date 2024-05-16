package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    //adding multiple sets  at one time of data using data provider
public class dataprovider {


	WebDriver driver;
@BeforeTest(alwaysRun=true)
	
	public void openweb() {
		

        driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}


@Test(dataProvider = "datap")
public void logintest(String username, String password) {
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
//	driver.findElement(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon")).click();
	
}

@DataProvider(name="datap")
public Object[][] datap() {
	
	return new Object[][] // 2 - D array
			{
		new Object[] { "Admin", "admin123" }, // new objects of 2darray and passing my data from it
		new Object[] { "Admin", "adminpass" },
		new Object[] { "user123", "admin123" },
		new Object[] { "operator", "user123" },
			
		};		
	
	
}


@AfterTest(alwaysRun=true)
public void teardown() {
	driver.close();
}
	

}

package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.utility.nullability.AlwaysNull;

public class Testdemo {
	WebDriver driver;
	
	@BeforeTest(alwaysRun=true)
	
	public void openweb() {
		

        driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}	
	

	@Test(groups="regression",priority=1)
	public void sendkeys() {
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
	}
	
	@Test(groups="smoke",priority=4)
	public void webtable() {
		
		
		String txt = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[9]/td[2]")).getText();
		
		System.out.println(txt);
	}
	
	@Test(groups="regression",priority=2)
	public void checkbox() {
		 driver.findElement(By.id("checkBoxOption1")).click();
	}
	
    @Test(groups="smoke",priority=3)
public void checkbox2() {
	
		 driver.findElement(By.id("checkBoxOption1")).click();
	}
	

	
	@AfterTest(alwaysRun=true)
	public void teardown() {
		driver.close();
	}
		
	
}

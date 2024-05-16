package day7;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	WebDriver driver;
	
	@Before
	public void setup() {
        driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	}
	
	@Test
	public void sendkeys() {
		driver.findElement(By.id("autocomplete")).sendKeys("hello");
	}
	
	@Test
    public void webtable() {
		
		
		String txt = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[9]/td[2]")).getText();
		
		System.out.println(txt);
	}
	@After
	public void teardown() {
		driver.close();
	}

}

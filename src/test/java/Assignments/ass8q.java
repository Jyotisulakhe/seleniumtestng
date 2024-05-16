package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ass8q {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void parallelt() {
		driver.findElement(By.id(null));
	}
	
	

}

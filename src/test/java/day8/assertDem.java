package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assertDem {

	WebDriver driver;
	
	@BeforeTest
	public void derodhatest() {
		 driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Practice Page";
		Assert.assertEquals(actualtitle, expectedtitle);
	
	}
	
	@Test
	public void clicktest() {
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		
	}
}

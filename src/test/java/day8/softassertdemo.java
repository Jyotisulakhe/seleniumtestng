package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertdemo {
	@Test
	
	public void zerodhatest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		Assert.assertEquals(actualtitle, expectedtitle);
		
		SoftAssert sa=new SoftAssert(); //softassert
		sa.assertEquals(actualtitle, expectedtitle);
		driver.findElement(By.linkText("Signup")).click();
		sa.assertAll();
	
	}

}

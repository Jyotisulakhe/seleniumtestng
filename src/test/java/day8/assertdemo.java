package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertdemo {
	
	@Test
	public void zerodhatest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/");
		driver.manage().window().maximize();
		String actualtitle = driver.getTitle();
		String expectedtitle = "Zerodha - Online stock trading at lowest prices from India's biggest stock broker – Zerodha";
		Assert.assertEquals(actualtitle, expectedtitle);
	
	}
}

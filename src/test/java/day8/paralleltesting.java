package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class paralleltesting {

	@Test
	public void chromeTest() {
		
		WebDriver dr= new ChromeDriver();
		dr.get("https://zerodha.com/");
		dr.findElement(By.linkText("Pricing")).click();
		dr.close();
	}
	
	
	@Test
	public void firefox() {
		
		WebDriver dr1= new FirefoxDriver();
		dr1.get("https://zerodha.com/");
		dr1.findElement(By.linkText("Pricing")).click();
		dr1.close();
		
	}
	
	
	@Test
	public void edgetest() {
		
		WebDriver dr2= new EdgeDriver();
		dr2.get("https://zerodha.com/");
		dr2.findElement(By.linkText("Pricing")).click();
		dr2.close();
		
	}
}

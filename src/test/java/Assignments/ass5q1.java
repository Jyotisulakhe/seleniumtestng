package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass5q1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("shoes");
		driver.findElement(By.id("gh-btn")).click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		js.executeScript("window.scrollBy(0,-1500)");
		driver.findElement(By.className("ui-autocomplete-input")).clear();
	}

}

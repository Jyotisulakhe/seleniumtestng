package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ass5q2 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.urlMatches("https://www.rahulshettyacademy.com/AutomationPractice/"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
		js.executeScript("document.getElementById(\"inputValEnter\").value=\"girl ashion\";");
		
//		 
		
	}

}

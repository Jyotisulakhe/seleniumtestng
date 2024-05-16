package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptexecutor {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		
		
		 d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)d;
		 WebElement brokenlink = d.findElement(By.linkText("Broken Link"));
		 js.executeScript("arguments[0].scrollIntoView();", brokenlink);
		 js.executeScript("document.getElementById(\"autocomplete\").value=\"jyoti\";");
//		 
	}
}

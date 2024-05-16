package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		dr.findElement(By.id("autocomplete")).sendKeys("India");
		Thread.sleep(2000);
//		dr.findElement(By.xpath());
		
		
		
		
		
		
		
		
	}

}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ass3q3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.ebay.com/");
		Actions act=new Actions(dr);
		
		WebElement fashion = dr.findElement(By.linkText("Fashion"));
		act.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		
		WebElement el = dr.findElement(By.linkText("Electronics"));
		act.moveToElement(el).build().perform();
		
}
	}


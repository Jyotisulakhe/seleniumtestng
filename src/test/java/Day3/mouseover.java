package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.ebay.com/");
		Actions act=new Actions(dr);
		
		WebElement link = dr.findElement(By.linkText("Health & Beauty"));
		act.moveToElement(link).build().perform();
		
		
}
}

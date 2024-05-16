package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametest {
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://v1.training-support.net/selenium/iframes");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src=\"/selenium/frame1\"]")));
//		dr.findElement(By.id("actionButton")).click();
//		
		dr.switchTo().frame(1);
		dr.findElement(By.id("actionButton")).click();
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame(0);
		dr.findElement(By.id("actionButton")).click();
	}
	
	

}

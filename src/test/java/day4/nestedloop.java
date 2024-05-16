package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//nested frame

public class nestedloop {
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://v1.training-support.net/selenium/nested-iframes");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement outerframe = dr.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));
		dr.switchTo().frame(outerframe);//switched
		WebElement innerframe1=dr.findElement(By.xpath("//iframe[@src'/selenium/frame1']"));
		dr.switchTo().frame(innerframe1);
		dr.findElement(By.xpath("//button[contains(text(),'Click Me!')])[1]")).click();
	}

}

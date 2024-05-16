package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
	public static void main(String[] args) {
		

		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		dr.findElement(By.id("alertBox")).click();
		WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		dr.switchTo().alert().accept();// alert handling (accepting alert)
	dr.findElement(By.className("confirmBox")).click();
//		
//		
	dr.findElement(By.id("confirmBox"));
//		

		
	}

}

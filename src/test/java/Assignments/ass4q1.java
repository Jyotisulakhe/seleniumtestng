package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass4q1 {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#");
	driver.findElement(By.id("alertBox")).click();
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirmBox")).click();
	
	driver.switchTo().alert().dismiss();
	driver.findElement(By.id("promptBox")).click();
	driver.switchTo().alert().sendKeys("hello");
	driver.switchTo().alert().accept();
}
}

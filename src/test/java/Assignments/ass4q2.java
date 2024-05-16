package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass4q2 {
	
	public static void main(String[] args) {
		
	
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.hyrtutorials.com/p/frames-practice.html");

	dr.switchTo().frame(1);
	dr.findElement(By.id("Header1_headerimg")).click();
	dr.switchTo().defaultContent();
	
	dr.switchTo().frame(2);
	dr.findElement(By.id("Header1_headerimg")).click();
}

}

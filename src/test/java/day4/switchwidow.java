package day4;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwidow {
	public static void main(String[] args) {
		
	
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	dr.findElement(By.linkText("Open Tab")).click();
	System.out.println(dr.getTitle());
	String parenthanle = dr.getWindowHandle();
	Set<String> llhandle = dr.getWindowHandles();
	
	for (String singlehandle : llhandle) {
		
		dr.switchTo().window(singlehandle);
		if(dr.getTitle().equals("QAClick Academy - A Testing Academy to learn, Earn and Shine")) {
			break;
		}
		
		
	}
	dr.findElement(By.linkText("Access all our Coueses")).click();
	}	
}

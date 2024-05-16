package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	WebElement dropdown = dr.findElement(By.id("dropdown-class-example"));
	
	Select s=new Select(dropdown);
	s.selectByIndex(3);
	Thread.sleep(2000);
	s.selectByValue("option2");
	Thread.sleep(2000);
	s.selectByVisibleText("Select");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass4q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://elementalselenium.com/");
		dr.findElement(By.id("email")).sendKeys("abc12@gmail.com");
		WebElement dropdown = dr.findElement(By.id("options"));
		Select s=new Select(dropdown);
		s.selectByValue("python");
		dr.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement dropdown1 = dr.findElement(By.name("fields[programming_language]"));
		Select s1=new Select(dropdown1);
		s1.selectByValue("Python");
		
		
		
dr.findElement(By.xpath("//label[@aria-hidden='true']")).click();
dr.findElement(By.name("submit")).click();
	}

}

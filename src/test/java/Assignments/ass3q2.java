package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass3q2 {

	public static void main(String[] args) {
		
	WebDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	dr.get("https://www.facebook.com/signup");
	
	dr.findElement(By.name("firstname")).sendKeys("jyoti");
	dr.findElement(By.name("lastname")).sendKeys("kumar");

	dr.findElement(By.name("reg_email__")).sendKeys("jyot123@gmail.com");
	dr.findElement(By.name("reg_passwd__")).sendKeys("jyoti");
	
	
WebElement dropdown = dr.findElement(By.name("birthday_day"));
	
	Select s=new Select(dropdown);
	
	s.selectByValue("3");
	
WebElement dropdown1 = dr.findElement(By.name("birthday_month"));
	
	Select s1=new Select(dropdown1);
	
	s1.selectByValue("3");

	
WebElement dropdown2 = dr.findElement(By.name("birthday_year"));
	
	Select s2=new Select(dropdown2);
	
	s2.selectByValue("2008");
	
	
	List<WebElement> radiobuttons = dr.findElements(By.id("u_0_4_aK"));
	for (WebElement radio : radiobuttons ) {
		  radio.click();
	}


	dr.findElement(By.name("websubmit")).click();
}
}
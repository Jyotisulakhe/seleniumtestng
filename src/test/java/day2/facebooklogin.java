package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebooklogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.name("username")).sendKeys("JyotiSulakhe");
		driver.findElement(By.name("password")).sendKeys("pass-09");
		driver.findElement(By.className("fa-sign-in")).click();
	}

}

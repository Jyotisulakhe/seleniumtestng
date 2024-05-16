package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		String txt = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[9]/td[2]")).getText();
		if(txt.contains("Python")) {
			System.out.println("Python");
		}else {
			System.out.println("failed test case");
		}
		
		
		
	}





}

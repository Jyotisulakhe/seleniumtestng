package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q6 {
//contains function xpath
		
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.bigbasket.com/");
			driver.findElement(By.xpath("//span[contains(text(),'Exotic Fruits & Veggies')]")).click();//1
			driver.findElement(By.xpath("//span[contains(text(),'Tea')]")).click();//2
			driver.findElement(By.xpath("//span[contains(text(),'Nandini')]")).click();//3
			driver.findElement(By.xpath("//span[contains(text(),'Category')]")).click();//4
			driver.findElement(By.xpath("//span[contains(text(),'Select Location')]")).click();//5
			
		}

	}
	
	
	



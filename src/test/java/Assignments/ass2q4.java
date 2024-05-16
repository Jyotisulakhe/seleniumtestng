package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q4 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		driver.findElement(By.xpath("//option[.='All Categories']")).click();//1
		driver.findElement(By.xpath("//option[.='Antiques']")).click();//2
		driver.findElement(By.xpath("//option[.='Art']")).click();//3
		driver.findElement(By.xpath("//option[.='Baby']")).click();//4
		driver.findElement(By.xpath("//option[.='Crafts']")).click();//5
		
		
		
	}
}

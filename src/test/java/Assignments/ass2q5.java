package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q5 {
	
		
		public static void main(String[] args) {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.com/");
			
			driver.findElement(By.xpath("(//select[@id='searchDropdownBox'])[1]"));
			driver.findElement(By.xpath("(//a[@class='hmenu-item'])[3]"));
			driver.findElement(By.xpath("//a[@class='hmenu-item'])[2]"));
			driver.findElement(By.xpath("//a[@class='hmenu-item'])[5]"));
			driver.findElement(By.xpath("//a[@class='hmenu-item'])[8]"));
			
			
		

	}

}

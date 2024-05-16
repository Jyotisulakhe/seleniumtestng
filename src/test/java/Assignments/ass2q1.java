package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q1 {

	public static void main(String[] args) {
		
		//write 20 xpath
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.redbus.com/");
	
	driver.findElement(By.xpath("//input[@id='src']")).click();//3
	driver.findElement(By.xpath("//img[@class='home-redirect rdc-redbus-logo ']")).click();//1
	driver.findElement(By.xpath("//a[@id='Airport Transfers']")).click();//2
	
	driver.findElement(By.xpath("//input[@id='dest']")).click();//4
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();//5
	driver.findElement(By.xpath("//div[@id='return-box']")).click();//6
	driver.findElement(By.xpath("//div[@class='search-lbl']")).click();//7
	driver.findElement(By.xpath("//div[@class='rdc-login']")).click();//8
	driver.findElement(By.xpath("//div[@id='curr_chosen']")).click();//9
	driver.findElement(By.xpath("//div[@class='manageHeaderLbl']")).click();//10
	driver.findElement(By.xpath("//a[@href='https://www.redbus.com/bus-ticket/singapore-to-kuala-lumpur']")).click();//11
	driver.findElement(By.xpath("//a[@href='https://www.redbus.com/bus-ticket/singapore-to-malacca']")).click();//12
	
	driver.findElement(By.xpath("//a[@href='https://www.redbus.com/bus-ticket/singapore-to-kl-sentral']")).click();//13
	driver.findElement(By.xpath("//a[@href='https://www.redbus.com/bus-ticket/kuala-lumpur-to-singapore']")).click();//14
	driver.findElement(By.xpath("//i[@class='plusMinus icon icon-minusv2']")).click();//15
	driver.findElement(By.xpath("//i[@class='interLink icon icon-down']")).click();//16
	driver.findElement(By.xpath("//a[@href='/info/aboutus']")).click();//17
	driver.findElement(By.xpath("//a[@href='/info/redcare\" and@class=\"rdc-footer-links']")).click();//18
	driver.findElement(By.xpath("//a[@href='https://www.redbus.in']")).click();//19
	driver.findElement(By.xpath("//a[@href='/info/privacypolicy']")).click();//20
}
}

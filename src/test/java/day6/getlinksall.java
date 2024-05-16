package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class getlinksall {
	public static void main(String[] args) {
		
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));// return type if findelements list of web element 
	
			System.out.println("total links"+ links.size());
			for (WebElement link : links) {
				
				String hrev=link.getAttribute("href");//getting links
				System.out.println(hrev);
			}

	
	
}
}
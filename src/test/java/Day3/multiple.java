package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple {
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkboxes = dr.findElements(By.xpath("//input['@class=radioButton']"));
		for (WebElement checkbox : checkboxes) {
			  checkbox.click();
		}
		
	}

}

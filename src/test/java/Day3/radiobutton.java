package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			List<WebElement> radiobuttons = dr.findElements(By.xpath("//input[@type='radio']"));
			for (WebElement radio : radiobuttons ) {
				  radio.click();
				  Thread.sleep(2000);
			}
			
		}

	}



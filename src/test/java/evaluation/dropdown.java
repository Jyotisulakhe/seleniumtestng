package evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://ilaindia.co.in/registration");
		
		
		WebElement drTitle = dr.findElement(By.id("jform_title"));
	
		Select s=new Select(drTitle);
		s.selectByIndex(1);
		
		WebElement firstn = dr.findElement(By.id("jform_first_name"));
		
		
		firstn.sendKeys("Jyoti");
		
WebElement lastn = dr.findElement(By.id("jform_last_name"));
		
		
		lastn.sendKeys("kumar");
		

		WebElement address = dr.findElement(By.id("jform_address_r"));
		address.sendKeys("Nagpur");
		
		
		
		WebElement country = dr.findElement(By.id("jform_country_r"));//select country dropdown
		Select s2=new Select(country);
		s2.selectByValue("99");
		
		WebElement state = dr.findElement(By.id("jform_state_r"));
		Select s3=new Select(state);
		s3.selectByVisibleText("Assam");
		
		
//		
		
		WebElement city = dr.findElement(By.id("jform_city_r"));
		Select s4=new Select(city);
		s4.selectByVisibleText("Dhubri");
		
		WebElement zipcode = dr.findElement(By.id("jform_zipcode_r"));
		
		zipcode.sendKeys("100394");
		
		
		dr.findElement(By.className("btn btn-info btn-block validate nextBtn")).click();
	
		
		

		
		
		
		
		
		
		
		
		
		
	}
}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass3q1 {

	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Datepicker.html");
		dr.findElement(By.id("datepicker1")).click();
		
//		
		String month = dr.findElement(By.className("ui-datepicker-month")).getText();
		String year = dr.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(month.equals("July")&&year.equals("2025"))) {
			
			dr.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
		 month = dr.findElement(By.className("ui-datepicker-month")).getText();
//		 Thread.sleep(2000);
		 year = dr.findElement(By.className("ui-datepicker-year")).getText();
		}
		
			 dr.findElement(By.linkText("2")).click();
				
		
		
	}
}



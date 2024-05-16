package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		dr.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait=new WebDriverWait(dr, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.id("ui-datepicker-div")))); //explicity wait commands
		
		
		//ui-datepicker-div
		//logic
		
		String month = dr.findElement(By.className("ui-datepicker-month")).getText();
		String year = dr.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(month.equals("October")&&year.equals("2024"))) {
			dr.findElement(By.xpath("//@[data-handler='next']")).click();
			month = dr.findElement(By.className("ui-datepicker-month")).getText();
			 year = dr.findElement(By.className("ui-datepicker-year")).getText();
			
			
			
			
		}
		dr.findElement(By.xpath("//td@[data-handler='selectDay']/a[.='2']")).click();
		
	}
	
	

}

package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q3 {
	//Write 5 Xpath using Multiple attributes 
	
	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.makemytrip.com/");
		dr.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		dr.findElement(By.xpath("//a[@id='superOffersTab_BANK_OFFERS\"][@class=\"makeFlex hrtlCenter column darkGreyText']]")).click();
		dr.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open\"][@placeholder=\"From']")).click();
		dr.findElement(By.xpath("//input[@class='topbarInputBox footerInput\"][@placeholder=\"Enter Mobile number']")).click();
		
		dr.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"][@data-cy=\"account']")).click();
		dr.findElement(By.xpath("//a[@class='capitalize\"][@data-cy=\"HotelSearchWidget_311']")).click();
		
		
	}

}

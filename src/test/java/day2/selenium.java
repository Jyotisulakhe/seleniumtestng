package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;


public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		dr.findElement(By.id("checkBoxOption1")).click();
		//dr.findElement(By.name("checkBoxOption1")).click();
		//dr.findElement(By.className("blinkingText")).click();
		//dr.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		dr.findElement(By.partialLinkText("Free Access")).click();
		
		 
		

	}

}

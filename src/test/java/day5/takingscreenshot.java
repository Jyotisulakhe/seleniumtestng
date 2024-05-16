package day5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class takingscreenshot {

	
static WebDriver d;
public static void capture(int number) throws IOException {
	 
	 TakesScreenshot ts=(TakesScreenshot)d;
	 File file1=ts.getScreenshotAs(OutputType.FILE);

	 File file2=new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Screenshotas"+number+".png");
	 FileUtils.copyFile(file1, file2);
	
}
	
public static void main(String[] args) throws IOException {
		 d=new ChromeDriver();
	d.manage().window().maximize();
	
		
	 d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		capture(1);
	 JavascriptExecutor js=(JavascriptExecutor)d;
	 WebElement brokenlink = d.findElement(By.linkText("Broken Link"));
	 js.executeScript("arguments[0].scrollIntoView();", brokenlink);
//	 js.executeScript("document.getElementById(\"autocomplete\").value=\"jyoti\";");
	 capture(2);
	
	}
}

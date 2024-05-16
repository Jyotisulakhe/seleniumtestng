package Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.page.Page.CaptureScreenshotFormat;
import org.openqa.selenium.interactions.Actions;

//drag and drop and screenshot
public class ass6q1 {

	static WebDriver dr;
	public static void Capture(int number) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)dr;
		 File file1 = ts.getScreenshotAs(OutputType.FILE);
		 File file2 = new File("C:\\Users\\Asus\\OneDrive\\Pictures\\Screenshotas"+number+".png");
		 FileUtils.copyFile(file1, file2);
	}
	
	
	public static void main(String[] args) throws IOException {
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://v1.training-support.net/selenium/drag-drop");
		Capture(1);
		WebElement ball = dr.findElement(By.id("draggable"));
		WebElement area = dr.findElement(By.id("dropzone2"));
		Actions act=new Actions(dr);
		act.dragAndDrop(ball, area).build().perform();
		Capture(2);
		
	}
}

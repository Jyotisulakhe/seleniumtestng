package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	
public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/FileDownload.html#google_vignette");
				driver.findElement(By.linkText("Download")).click();
//				driver.manage().window();
}
}

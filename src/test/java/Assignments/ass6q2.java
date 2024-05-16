package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass6q2 {

	
public static void main(String[] args) {
		

		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://demo.automationtesting.in/FileUpload.html");
				driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\Asus\\OneDrive\\Desktop\\Jyoti_Sulakhe_Resume.pdf");
//				
//				
	}
}

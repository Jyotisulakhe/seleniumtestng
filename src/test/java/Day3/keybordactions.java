package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybordactions {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/login.php/");
		WebElement username = dr.findElement(By.id("email"));
		WebElement password = dr.findElement(By.id("pass"));
		
		Actions act=new Actions(dr);
		act.keyDown(username,Keys.SHIFT).sendKeys("jyoti").keyUp(username,Keys.SHIFT).build().perform();
		
		act.keyDown(password,Keys.SHIFT).sendKeys("pass123").keyUp(username,Keys.SHIFT).build().perform();
		
		Thread.sleep(2000);
		
		for (int i=0;i<8;i++) {
			
	
		act.keyDown(password,Keys.BACK_SPACE).keyUp(password,Keys.BACK_SPACE).build().perform();
		
		}
	
	
	
	
	
	
	
}	
	
	
}

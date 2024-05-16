package Day3;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://v1.training-support.net/selenium/drag-drop");
		
		WebElement ball = dr.findElement(By.id("draggable"));
	WebElement area = dr.findElement(By.id("droppable"));
	Actions act= new Actions(dr);
	act.dragAndDrop(ball, area).build().perform();
		
}

}

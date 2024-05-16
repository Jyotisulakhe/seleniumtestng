package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = dr.findElement(By.xpath("//span[.='right click me']"));
		Actions act=new Actions(dr);
		act.contextClick(right).build().perform();

}
}
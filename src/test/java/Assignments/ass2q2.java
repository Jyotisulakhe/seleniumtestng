package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2q2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("img[title='Flipkart']"));//1
		driver.findElement(By.cssSelector("img[alt='Menu']"));//2
		driver.findElement(By.cssSelector("img[alt='Cart']"));//3
		driver.findElement(By.cssSelector("img[alt='Get App']"));//4
		driver.findElement(By.cssSelector("img[alt='Login']"));//5
		driver.findElement(By.cssSelector("div[dir='auto']"));//6
		driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']"));//7
		driver.findElement(By.cssSelector("img[alt='Dropdown with more help links']"));//8
		driver.findElement(By.cssSelector("img[alt='Travel']"));//9
		driver.findElement(By.cssSelector("div[class=\"_1wE2Px\"]"));//10
		driver.findElement(By.cssSelector("img[alt='Mobiles']"));//11
		driver.findElement(By.cssSelector("div[class='_1wE2Px']"));//12
		driver.findElement(By.cssSelector("img[alt='Grocery']"));//13
		driver.findElement(By.cssSelector("div[class='_1wE2Px']"));//14
		driver.findElement(By.cssSelector("img[alt='Appliances']"));//15
		driver.findElement(By.cssSelector("a[title='Brand Directory']"));//16
		driver.findElement(By.cssSelector("a[aria-label='Advertise']"));//17
		driver.findElement(By.cssSelector("a[aria-label='Gift Cards']"));//18
		driver.findElement(By.cssSelector("a[aria-label='Help Center']"));//19
		driver.findElement(By.cssSelector("a[aria-label='Become a Seller']"));//20
	}
}

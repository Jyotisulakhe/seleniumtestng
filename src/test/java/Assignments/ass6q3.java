package Assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass6q3 {

	
	public static void main(String[] args) throws IOException {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.instagram.com/accounts/login/?hl=en");
		
		FileInputStream fil = new FileInputStream("C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\seleniumproject\\src\\test\\resources\\testdata\\testdata.xlsx");
		
		Workbook book = WorkbookFactory.create(fil);
		
		
		
		
		String email = book.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		
		String pass = book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		dr.findElement(By.name("username")).sendKeys(email);
		dr.findElement(By.name("password")).sendKeys(pass);
		dr.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		
		
		
	}
}

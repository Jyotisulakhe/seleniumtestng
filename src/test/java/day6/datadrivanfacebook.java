package day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadrivanfacebook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		
	WebDriver driver = new ChromeDriver();		
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login.php/");
	
	//step1 we have to mention path of excel file
	FileInputStream fil = new FileInputStream("C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\seleniumproject\\src\\test\\resources\\testdata\\testdata.xlsx");
	
	
	//step2 using workbookfactory use create() and specify the fil refrence
	Workbook book = WorkbookFactory.create(fil);
	
	
	//step3  using poi methods get values from excel
	
	String email = book.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	
	String pass = book.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.name("login")).click();
	book.close();
	
	
	

}
}
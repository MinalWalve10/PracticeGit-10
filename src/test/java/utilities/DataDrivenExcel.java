package utilities;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataDrivenExcel extends Utility {
	static WebDriver driver;
	public static void main(String[] args)
	{
		//driver= BaseClass.LaunchURL("newurl");
		
		Utility.LaunchURL("newurl");
		
		Utility.ReadExcel();
//		ArrayList<Object> data= new ArrayList<Object>();
//	
//	WebElement FirstName= driver.findElement(By.xpath("//input[@name='firstName']"));
//	FirstName.sendKeys(data.get(0).toString());
	
//	WebElement LastName= driver.findElement(By.xpath("//input[@name='lastName']"));
//	LastName.sendKeys(data.get(1).toString());
//
//
//	WebElement Email= driver.findElement(By.xpath("//input[@name='phone']"));
//	Email.sendKeys(data.get(2).toString());
//
//
//	WebElement Phono= driver.findElement(By.xpath("//input[@name='userName']"));
//	Phono.sendKeys(data.get(3).toString());

	}

}

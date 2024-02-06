package SeleniumClass;
import javax.swing.text.Document;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class Scrolling {
	
	public static void main(String[] agrs)
	{
		//Initiatiate webdriver
		WebDriver driver= new ChromeDriver();
		driver.get(Utility.ReadProerty("url"));
		driver.manage().window().maximize();
		
		//Typecasting- javascript is an interface we cant create object of that so we pass reference of a webdriver
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0, 3000)", "");
	    
	    js.executeScript("window.scrollBy(0,document.body.scrollheight)");
	    
	    WebElement xyz = null;
	  //  js.executeScript("argument[0].scrollIntoView()", xyz);
	    
	}

}

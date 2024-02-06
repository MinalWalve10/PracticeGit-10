package SeleniumClass;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BaseClass;


public class ImplicitWait {

	  public static void main(String[] args)
	  {
		  WebDriver driver= new ChromeDriver();
		  BaseClass.launchURL("url");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		  
		  driver.quit();
	  }
}


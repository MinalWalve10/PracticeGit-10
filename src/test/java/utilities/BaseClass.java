package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    
	
	
	//WebDriver driver;
	public static WebDriver launchURL(String url) {
	    try {
	        WebDriver driver = new ChromeDriver();
	        driver.get(Utility.ReadProerty(url));
	        driver.manage().window().maximize();
	        return driver;
	    } catch (Exception e) {
	        // Handle exception, log the error, or throw a custom exception
	        e.printStackTrace();
	        return null; // Or handle it as per your application's requirements
	    }
	}

}

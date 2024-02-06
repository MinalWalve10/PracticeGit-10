package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Annotations {
	
	@BeforeSuite(description = "Verify Before Suit")
	public void BeforeSuitMethod()
	{
		System.out.println("Before Suit Executed");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test()
	public void launchURL()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		AssertJUnit.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		Assert.assertNotEquals(driver.getCurrentUrl(), "ttps://omayo.blogspot.com/");

	    SoftAssert A= new SoftAssert();
	    AssertJUnit.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	    A.assertNotEquals(driver.getCurrentUrl(), "ttps://omayo.blogspot.com/");
	    
	    AssertJUnit.assertTrue(driver.getTitle().equals("omayo (QAFox.com)"));
	    
		driver.quit();

	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterSuite
	public void AfterSuitMethod()
	{
		System.out.println(" After suit Executed");
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
	}

}

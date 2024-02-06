package SeleniumClass;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectin {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement Dropdown= driver.findElement(By.xpath("//select[@id='drop1']"));
		
		Select select= new Select(Dropdown);
		List<WebElement> dropdownOption=  select.getOptions();
		
		for(WebElement Options: dropdownOption)
		{
			System.out.println(Options.getText());
		}

		boolean CheckMultiple= select.isMultiple();
		System.out.println(CheckMultiple);
		
		//By Index
		select.selectByIndex(2);
		
		//ByName
		select.selectByValue("def");
		
		//ByvisibleText
		select.selectByVisibleText("doc 4");
		
	

		
	}

}
	
		
//		
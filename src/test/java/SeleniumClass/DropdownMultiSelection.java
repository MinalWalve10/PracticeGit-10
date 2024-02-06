package SeleniumClass;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiSelection {
	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement MultiSelection= driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		Select select= new Select(MultiSelection);
		List<WebElement> AllMultiSelection= select.getOptions();
		
		for(WebElement AllMultiSelectionoption: AllMultiSelection )
		{
			System.out.println("All Options =" + AllMultiSelectionoption.getText());
		}
		
		
		select.deselectByIndex(1);
		select.deselectByValue("Hyundaix");
		select.deselectByVisibleText("Swift");
			
		select.selectByIndex(0);
		select.selectByValue("Hyundaix");
		select.selectByVisibleText("Swift");

		List<WebElement> SelectedOption= select.getAllSelectedOptions();
		for(WebElement AllSelected: SelectedOption) {
			System.out.println(AllSelected.getText());
		}
		
		
		
	}

}

package SeleniumClass;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandle {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement NewWindow= driver.findElement(By.xpath("//a[@id='link2' and @target='_blank']"));
		NewWindow.click();
		
		String Parent= driver.getWindowHandle();
		Set<String> Child= driver.getWindowHandles();
		
		for(String Window: Child)
		{
			if(!Window.equals(Parent))
			{
		    driver.switchTo().window(Window);
			}
		}
		
		String NewWindowTitle= driver.getTitle();
		System.out.println(NewWindowTitle);
		driver.close();
		
		driver.switchTo().window(Parent);
		WebElement ParentWindowText= driver.findElement(By.xpath("//a[text()=\"Page One\"]"));
		System.out.println(ParentWindowText.getText());
		//driver.quit();
		
		///New Tab
		WebElement NewTab= driver.findElement(By.xpath("//a[text()=\"Open a popup window\"]"));
		System.out.println(NewTab.getText());
		NewTab.click();
		Thread.sleep(5000);

		Child=driver.getWindowHandles();
		
	    for(String NewTabWindow : Child)
	    {
	    	if(!NewTabWindow.equals(Parent))
	    	{
	    		driver.switchTo().window(NewTabWindow);
	    	}
	    }
		String NewTabURL= driver.getCurrentUrl();
		System.out.println(NewTabURL);
		
		driver.close();
		driver.switchTo().window(Parent);
		System.out.println(ParentWindowText.getText());
	
		
	}

}

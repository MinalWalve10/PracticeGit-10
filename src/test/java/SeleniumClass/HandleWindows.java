package SeleniumClass;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement POPupWindow= driver.findElement(By.xpath("//a[text()=\"Open a popup window\"]"));
		POPupWindow.click();
		
		String ParentWindow= driver.getWindowHandle();
		Set<String> ChildWindow= driver.getWindowHandles();
		
		for(String Windowhandle: ChildWindow)
		{
			if(!Windowhandle.equals(ParentWindow))
			{
				driver.switchTo().window(Windowhandle);
			}
		}
		
		WebElement NewWindow= driver.findElement(By.xpath("//h3"));
		System.out.println(NewWindow.getText());
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		WebElement ParentWindowTitle= driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(ParentWindowTitle.getText());
				
		driver.findElement(By.xpath("//a[text()=\"SeleniumTutorial\"]")).click();
		Thread.sleep(5000);
		
		ChildWindow= driver.getWindowHandles();
		
		for(String Windowhandle: ChildWindow)
		{
			if(!Windowhandle.equals(ParentWindow))
			{
				driver.switchTo().window(Windowhandle);
			}
		}
		
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		driver.close();
		
		
		
	}

}

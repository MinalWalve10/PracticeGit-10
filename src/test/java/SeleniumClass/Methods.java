package SeleniumClass;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;

public class Methods {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();

		// get
		driver.get("https://omayo.blogspot.com/");

		// Title
		String Title = driver.getTitle();
		System.out.println(Title);

		// manage
		driver.manage().window().maximize();

		// Find element
		WebElement ClassName = driver.findElement(By.className("title"));
		System.out.println(ClassName.getText());
		
		// sendkeys
		WebElement TextBox= driver.findElement(By.xpath("//div[@class=\"widget-content\"]//textarea[@id=\"ta1\"]"));
		TextBox.sendKeys("Good Afternoon, Have a remaining good day");
		
		//Clear
		TextBox.clear();
		Thread.sleep(2000);


		// Click
		WebElement Clickable = 
				driver.findElement(By.xpath("//div[@class=\"widget-content\"]//a[@id=\"link2\" and @target=\"_blank\"]"));
		Clickable.click();

		// Text
		System.out.println(Clickable.getText());

		// getttribute
		System.out.println(Clickable.getAttribute("innerHTML"));

		// Find elements
		List<WebElement> Lis= driver.findElements(By.xpath("//div[@class=\"widget-content\"]//ol//li"));
		for(WebElement list : Lis)
		{
			System.out.println(list.getText());
		}
	
		// screenshot
		WebElement Dropdown= driver.findElement(By.id("drop1"));
		File F= Dropdown.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(F, new File("src/test/resources/Screenshots/img.png"));
		
		//isdisplayed
		WebElement TryIT= driver.findElement(By.xpath("//button[text()='Try it']"));
		WebElement MyButton= driver.findElement(By.xpath("//button[@id='myBtn']"));
		System.out.println(MyButton.isDisplayed());
		TryIT.click();
		System.out.println(TryIT.isSelected());
		Thread.sleep(3000);
		System.out.println(MyButton.isEnabled());
				
		// Navigarte to
		driver.navigate().to("https://www.facebook.com/");

		// Close
		driver.close();

		// Quit
		driver.quit();
	
		
		
	}

}

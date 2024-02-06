package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("userid")).sendKeys("Minal Walve");
		WebElement UserID= driver.findElement(By.name("userid"));
		UserID.sendKeys("Minal");
		
		//System.out.println(driver.findElement(By.tagName("title")).getAttribute("innerHTML"));
		WebElement Title= driver.findElement(By.tagName("title"));
		System.out.println(Title.getAttribute("innerHTML"));
		
		WebElement Title2= driver.findElement(By.className("title"));
		System.out.println(Title2.getText());
		
		WebElement LinkText= driver.findElement(By.linkText("Page One"));
		System.out.println(LinkText.getText());
		
		//partial link and full link
		WebElement FullLink= driver.findElement(By.linkText("Page One"));
		System.out.println(LinkText.getText());
		
		//driver.quit();
		WebElement Link=driver.findElement(By.linkText("SeleniumTutorial"));
		System.out.println(Link.getAttribute("innerHTML"));
		
		WebElement PartialLink=driver.findElement(By.partialLinkText("Page"));
		System.out.println(PartialLink.getAttribute("innerHTML"));
		
		//29/12/2023
		WebElement GetText= driver.findElement(By.xpath("//h2[@class='title' and text()='Text Area Field']"));
		System.out.println(GetText.getAttribute("innerHTML"));
	}

}
